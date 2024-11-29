package com.ust.app.springsecurity.dto;

//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
public class JwtToken {
    private String jwt;

    public JwtToken(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public JwtToken() {
    }
}
