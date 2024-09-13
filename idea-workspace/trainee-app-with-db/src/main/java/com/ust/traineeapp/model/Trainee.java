package com.ust.traineeapp.model;

import java.time.LocalDate;

public class Trainee {
    private int id;
    private String name;
    private String location;
    private LocalDate joinedDate;

    public Trainee(int id, String name, String location, LocalDate joinedDate) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.joinedDate = joinedDate;
    }

    public Trainee(String name, String location, LocalDate joinedDate) {
        this.name = name;
        this.location = location;
        this.joinedDate = joinedDate;
    }

    public int id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String location() {
        return location;
    }

    public LocalDate joinedDate() {
        return joinedDate;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", joinedDate=" + joinedDate +
                '}';
    }
}
