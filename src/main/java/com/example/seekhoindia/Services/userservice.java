package com.example.seekhoindia.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.seekhoindia.Beans.userdetail;
import com.example.seekhoindia.Repository.userrepository;

@Component
public class userservice {
    @Autowired
    userrepository ur;

    // public List<userdetail> getallBook() {

    //     List<userdetail> l = (List<userdetail>) ur.findAll();
    //     return l;
    // }

    public void save(userdetail user) {
        ur.save(user);
    }



    public Iterable<userdetail> getAllEmployee()
    {
        return ur.findAll();
    }

    public userdetail getById(int id)
    {
        Optional<userdetail> optional = ur.findById(id);
        userdetail user = null;
        if (optional.isPresent())
            user = optional.get();
        else
            throw new RuntimeException(
                "Employee not found for id : " + id);
        return user;
    }
 
     public void deleteViaId(int id)
    {
        ur.deleteById(id);
    }
}
