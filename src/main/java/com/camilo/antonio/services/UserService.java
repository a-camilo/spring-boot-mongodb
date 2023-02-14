package com.camilo.antonio.services;

import com.camilo.antonio.domain.User;
import com.camilo.antonio.dto.UserDTO;
import com.camilo.antonio.repository.UserRepository;
import com.camilo.antonio.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public User insert(User obj) {
        return repository.insert(obj);
    }

    public User update(User obj){
        User newObj = repository.findById(obj.getId()).orElseThrow();
        updateData(newObj, obj);
        return repository.save(newObj);
    }

    private void updateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }

    public void delete(String id){
        findById(id);
        repository.deleteById(id);
    }

    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}