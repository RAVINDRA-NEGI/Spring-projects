package com.shop.UserService.services;

import com.shop.UserService.model.Users;
import com.shop.UserService.model.Users.Role;
import com.shop.UserService.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;




@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
   private UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public ResponseEntity<String> registerUser(Users user) {
      try {
          user.setRole(Role.Buyer);
          user.setPassword(passwordEncoder.encode(user.getPassword()));
         userRepository.save(user);
         return  new ResponseEntity<>("registered a new user", HttpStatus.OK);
      }
      catch(Exception e){
          logger.error("User Not Registered ", e);
          return new ResponseEntity<>("failed to register user" , HttpStatus.INTERNAL_SERVER_ERROR);
      }

    }

    public ResponseEntity<String> registerSerller(Users user) {
        try {

        }catch(Exception e) {

        }

    }

    public ResponseEntity<String> registerAdmin(Users user) {
        try {

        }catch(Exception e) {

        }

    }
}
