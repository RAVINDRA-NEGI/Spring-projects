package com.shop.UserService.controllers;

import com.shop.UserService.model.Users;
import com.shop.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/userregister")
    public ResponseEntity<String> registerUser(@RequestBody Users user){
        return userService.registerUser(user);
    }

    @PostMapping("/adminregister")
    public ResponseEntity<String>RegisterSeller(@RequestBody Users user){
        return  userService.registerSerller(user);
    }

    @PostMapping("/adminregister")
    public ResponseEntity<String>RegisterAdmin(@RequestBody Users user) {

        return userService.registerAdmin(user);
    }
}
