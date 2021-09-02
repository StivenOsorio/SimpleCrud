package com.example.demo.service;

import com.example.demo.model.UserEntity;
import com.example.demo.repository.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    
    }

    public UserEntity getUser(Long id){

        return userRepository.findById(id).orElse(null);
    } 
    public UserEntity saveUser(UserEntity user){
        return userRepository.save(user);
    }
}
