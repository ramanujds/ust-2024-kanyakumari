package com.ust.serialization;

import java.io.Serializable;

public class Trainee implements Serializable {

    private static final long serialVersionUID = 6722785098267757690L;

    private int id;
    private String name;


    private transient String email;

    public Trainee() {
        super();
    }

    public Trainee(int id, String name, String email) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Trainee [id=" + id + ", name=" + name + ", email=" + email + "]";
    }

}
