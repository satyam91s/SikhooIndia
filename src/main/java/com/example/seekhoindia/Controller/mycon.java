package com.example.seekhoindia.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.seekhoindia.Beans.userdetail;
import com.example.seekhoindia.Services.userservice;

@Controller
public class mycon {
    @Autowired
    userservice bs;
    // @RequestMapping("/")
    // public String Home() {
    //     return "home";
    // }



    // @RequestMapping("/login")
    // public String LoginRegister() {
    //     return "LoginRegister";
    // }

    // @RequestMapping(value = "/register", method = RequestMethod.POST)
    // public ModelAndView save(@ModelAttribute userdetail user) {
    //     ModelAndView modelAndView = new ModelAndView();
    //     modelAndView.setViewName("user-detail");
    //     modelAndView.addObject("user", user);
    //     return modelAndView;
    // }


    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("allemplist", bs.getAllEmployee());
        return "Home";
    }

    @GetMapping("/login")
    public String addNewEmployee(Model model) {
       userdetail user=new userdetail();
        model.addAttribute("user", user);
        return "LoginRegister";
    }

        @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("user") userdetail user) {
        bs.save(user);
        return "redirect:/";
    }

    
    @GetMapping("/showFormForUpdate/{id}")
    public String updateForm(@PathVariable(value = "id") int id, Model model) {
        userdetail user = bs.getById(id);
        model.addAttribute("user", user);
        return "update";
    }
 
    @GetMapping("/deleteEmployee/{id}")
    public String deleteThroughId(@PathVariable(value = "id") int id) {
        bs.deleteViaId(id);
        return "redirect:/";
 
    }
   
    // @GetMapping("/register")
    // public List<userdetail> getBook()
    // {
    //     return this.bs.getallBook();
    // }

}
