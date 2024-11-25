package com.ust.app.springsecurity.service;

import com.ust.app.springsecurity.model.UserModel;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class UserDetailsImpl implements UserDetails {

    private String username;
    private String password;
    private String roles;

    public UserDetailsImpl(UserModel user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.roles = user.getRole();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_"+roles);
        return List.of(authority);

    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
