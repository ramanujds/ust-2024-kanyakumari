package com.ust.authservice.service;

import com.ust.authservice.model.UserModel;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class UserDetailsImpl implements UserDetails {

    private String username;
    private String password;
    private String role;

    public UserDetailsImpl(UserModel user){

        this.username=user.getUsername();
        this.password=user.getPassword();
        this.role=user.getRole();
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
//        SimpleGrantedAuthority authority = new SimpleGrantedAuthority("ROLE_"+role);
//        return List.of(authority);

        return Arrays.stream(role.split(","))
                .map(String::trim)
                .map(String::toUpperCase)
                .map(r->"ROLE_"+r)
                .map(SimpleGrantedAuthority::new)
                .toList();

    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public boolean isAccountNonExpired() {
        return true;
    }

    public boolean isAccountNonLocked() {
        return true;
    }

    public boolean isCredentialsNonExpired() {
        return true;
    }

    public boolean isEnabled() {
        return true;
    }
}
