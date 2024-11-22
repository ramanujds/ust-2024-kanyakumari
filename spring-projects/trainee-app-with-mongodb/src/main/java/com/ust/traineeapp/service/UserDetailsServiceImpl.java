package com.ust.traineeapp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserModel savedUser = userRepo.findByUsername(username).orElseThrow(
                ()->new UsernameNotFoundException("Invalid Username"));

        return User.withUsername(savedUser.getUsername())
                .password(savedUser.getPassword())
                .roles(savedUser.getRole())
                .accountExpired(false)
                .accountLocked(false)
                .credentialsExpired(false)
                .disabled(false)
                .build();

    }
}
