package com.example.demo.controller;

import com.example.demo.model.UserEntity;
import com.example.demo.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/app")
public class UserController {

    private final UserService userService;
    
    
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping(value = "user")
    public UserEntity createUser(@RequestBody UserEntity user){
        return userService.saveUser(user);
    }
    @GetMapping(value = "/user")
    public UserEntity getUser(@RequestParam Long id){
        return userService.getUser(id);
    }
}
