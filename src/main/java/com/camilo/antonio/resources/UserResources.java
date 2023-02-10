package com.camilo.antonio.resources;

import com.camilo.antonio.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResources {


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {

        User user1 = new User("1", "Maria Brown", "maria@gamil.com");
        User user2 = new User("2", "Alex Green", "alex@gamil.com");

        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(user1, user2));

        return ResponseEntity.ok().body(list);
    }
}
