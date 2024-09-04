package com.app.employeehierarchy.model;
public class Manager extends Employee {
    private int teamSize;

    public Manager(int employeeId, String name, double salary, int teamSize) {
        super(employeeId, name, salary);
        this.teamSize = teamSize;
    }

    // TODO: Implement getters and setters specific to Manager class

    // TODO: Override toString method to display manager information
}

