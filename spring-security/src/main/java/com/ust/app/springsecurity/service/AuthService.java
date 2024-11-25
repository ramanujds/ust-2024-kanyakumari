package com.ust.app.springsecurity.service;

import com.ust.app.springsecurity.dto.JwtToken;
import com.ust.app.springsecurity.dto.UserCredentials;
import com.ust.app.springsecurity.model.UserModel;
import com.ust.app.springsecurity.repository.UserRepository;
import com.ust.app.springsecurity.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    public JwtToken authenticate(UserCredentials userCredentials){

        UserModel userModel = userRepo.findByUsername(userCredentials.getUsername())
                .orElseThrow();

       if(!passwordEncoder.matches(userCredentials.getPassword(),userModel.getPassword())){
           throw new RuntimeException("Invalid Credentials");
       }

       String jwt = jwtUtil.generateToken(userModel.getUsername());
       return new JwtToken(jwt);
    }


}
