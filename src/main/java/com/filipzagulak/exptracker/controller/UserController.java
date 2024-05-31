package com.filipzagulak.exptracker.controller;

import com.filipzagulak.exptracker.model.User;
import com.filipzagulak.exptracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
