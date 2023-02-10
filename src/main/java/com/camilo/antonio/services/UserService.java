package com.camilo.antonio.services;

import com.camilo.antonio.domain.User;
import com.camilo.antonio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
       return repository.findAll();
    }

}
