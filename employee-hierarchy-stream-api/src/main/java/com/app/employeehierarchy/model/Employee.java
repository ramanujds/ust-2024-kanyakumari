package com.app.employeehierarchy.model;

public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    // TODO: Implement getters and setters

    // TODO: Override toString method to display employee information
}
