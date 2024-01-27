package com.example.seekhoindia.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.seekhoindia.Beans.userdetail;

public interface userrepository extends CrudRepository<userdetail,Integer> {
    
}
