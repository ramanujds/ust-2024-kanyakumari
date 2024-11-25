package com.ust.app.springsecurity.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user_data")
@Data
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String password;
    private String role;

}
