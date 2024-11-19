package com.ust.traineeapp.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

//    @Autowired
//    private UserRepository userRepo;

//    @Autowired
//    private PasswordEncoder passwordEncoder;

//    @PostMapping
//    public UserModel saveUser(@RequestBody UserModel user){
//
//        String password = user.getPassword();
//        String encodedPassword = passwordEncoder.encode(password);
//        user.setPassword(encodedPassword);
//        return userRepo.save(user);
//    }

}
