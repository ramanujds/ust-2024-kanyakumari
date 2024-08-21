package com.ust.employeehierarchy.model;

public class Developer extends Employee{

    private String programmingLanguage;

    public Developer(int id, String name, float salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage=programmingLanguage;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Language : "+programmingLanguage);
    }

    @Override
    public void report() {
        System.out.println("I report to Manager");
    }
}
