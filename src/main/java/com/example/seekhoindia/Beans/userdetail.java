package com.example.seekhoindia.Beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userdetail")
public class userdetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    int id;
    String name;
    String email;
    String password;
    String Role;
    Long mobile;

    public userdetail(int id, String name, String email, String password, String role, Long mobile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        Role = role;
        this.mobile = mobile;
    }
    public userdetail() {
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return Role;
    }
    public void setRole(String role) {
        Role = role;
    }
    public Long getMobile() {
        return mobile;
    }
    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }
    @Override
    public String toString() {
        return "userdetail [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", Role="
                + Role + ", mobile=" + mobile + "]";
    }

    
}
