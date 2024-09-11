package com.app.employeehierarchy.model;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(int employeeId, String name, double salary, String programmingLanguage) {
        super(employeeId, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // TODO: Implement getters and setters specific to Developer class

    // TODO: Override toString method to display developer information
}

