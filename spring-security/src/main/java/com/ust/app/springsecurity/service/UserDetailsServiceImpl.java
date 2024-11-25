package com.ust.app.springsecurity.service;

import com.ust.app.springsecurity.model.UserModel;
import com.ust.app.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel user = userRepo.findByUsername(username)
                .orElseThrow(()->new UsernameNotFoundException("Username Doesn't Exist"));

        return new UserDetailsImpl(user);

    }
}
