package com.ust.authservice.service;

import com.ust.authservice.dto.JwtToken;
import com.ust.authservice.dto.UserCredentials;
import com.ust.authservice.model.UserModel;
import com.ust.authservice.repository.UserRepository;
import com.ust.authservice.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public JwtToken loginUser(UserCredentials userCredentials){

        UserModel userModel = userRepository.findByUsername(userCredentials.username())
                .orElseThrow(()->new UsernameNotFoundException("User with name "+userCredentials.username()+" not found"));

        if(!passwordEncoder.matches(userCredentials.password(),userModel.getPassword())){
            throw  new RuntimeException("Invalid Credentials");
        }

        String jwt = jwtUtil.generateToken(userCredentials.username());
        return new JwtToken(jwt);

    }


}
