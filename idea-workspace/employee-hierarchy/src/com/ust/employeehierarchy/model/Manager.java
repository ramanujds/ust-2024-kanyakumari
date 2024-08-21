package com.ust.employeehierarchy.model;

public class Manager extends Employee{

    private int teamSize;

    public Manager(int id, String name, float salary, int teamSize) {
        super(id, name, salary);
        this.teamSize = teamSize;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size : "+teamSize);
    }

    @Override
    public void report() {
        System.out.println("I report to CEO");
    }
}
