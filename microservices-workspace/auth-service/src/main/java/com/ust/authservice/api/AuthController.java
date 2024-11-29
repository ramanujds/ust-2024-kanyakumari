package com.ust.authservice.api;

import com.ust.authservice.dto.JwtToken;
import com.ust.authservice.dto.UserCredentials;
import com.ust.authservice.dto.UserDtoResponse;
import com.ust.authservice.model.UserModel;
import com.ust.authservice.service.AuthenticationService;
import com.ust.authservice.service.UserCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private UserCrudService userCrudService;

    @PostMapping("/login")
    public JwtToken login(@RequestBody UserCredentials userCredentials){

      return authenticationService.authenticate(userCredentials);

    }

    @PostMapping("/validate")
    public void validateToken(@RequestParam String token){
        authenticationService.validateToken(token);
    }

    @PostMapping("/signup")
    public UserDtoResponse signup(@RequestBody UserModel user){
        return userCrudService.saveUser(user);
    }

    @PostMapping("/logout")
    public void logout(){
        authenticationService.logout();
    }


}
