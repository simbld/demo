package com.udemy.demo.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    private List<User> userList = new ArrayList<>(); // Implémentation des méthodes CRUD pour les utilisateurs en utilisant userList

    @PostMapping(value = "/users")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        userList.add(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
