package com.udemy.demo.user;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@Validated
public class UserController {

    @PostMapping("/users")
    public ResponseEntity addUser(@Valid @RequestBody User user) {
        User userOld = new User("toto@email.com");
        return new ResponseEntity<>(userOld, HttpStatus.CREATED);
    }
}
