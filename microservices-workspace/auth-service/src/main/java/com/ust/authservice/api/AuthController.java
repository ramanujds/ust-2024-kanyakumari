package com.ust.authservice.api;

import com.ust.authservice.dto.JwtToken;
import com.ust.authservice.dto.UserCredentials;
import com.ust.authservice.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/login")
    public JwtToken login(@RequestBody UserCredentials userCredentials){

      return authenticationService.loginUser(userCredentials);

    }


}
