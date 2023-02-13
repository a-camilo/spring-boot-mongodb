package com.camilo.antonio.services;

import com.camilo.antonio.domain.User;
import com.camilo.antonio.repository.UserRepository;
import com.camilo.antonio.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {

        User user = repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));

        return user;
    }
}
