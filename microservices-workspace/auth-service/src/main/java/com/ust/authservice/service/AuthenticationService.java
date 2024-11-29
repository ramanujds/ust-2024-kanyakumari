package com.ust.authservice.service;

import com.ust.authservice.dto.JwtToken;
import com.ust.authservice.dto.UserCredentials;
import com.ust.authservice.model.UserModel;
import com.ust.authservice.repository.UserRepository;
import com.ust.authservice.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Service;

import java.net.http.WebSocket;

@Service
public class AuthenticationService {


    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtUtil jwtUtil;



    public JwtToken authenticate(UserCredentials userCredentials) {

        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(userCredentials.username(), userCredentials.password()));
            String username = authentication.getName();
            return new JwtToken(jwtUtil.generateToken(username));


        } catch (AuthenticationException e) {
            throw new RuntimeException("Invalid Credentials", e);
        }


    }
    public void validateToken(String token) {
        String username = jwtUtil.getUsernameFromToken(token);
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
    }

    public void logout(){
        SecurityContextHolder.clearContext();
    }

}