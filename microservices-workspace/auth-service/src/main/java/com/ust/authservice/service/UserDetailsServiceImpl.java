package com.ust.authservice.service;

import com.ust.authservice.model.UserModel;
import com.ust.authservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserModel userModel = userRepository.findByUsername(username)
                .orElseThrow(()->new UsernameNotFoundException("User with name "+username+" not found"));

        return new UserDetailsImpl(userModel);
    }
}
