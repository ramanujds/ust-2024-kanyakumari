package com.ust.example.model;

public class Employee extends Person {

    private long employeeId;
    private float salary;

    private Department department;

    public Employee() {
    }

    public Employee(String name, int age, String location, long employeeId, float salary) {
        super(name, age, location);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


    public void sayHello(){
        System.out.println("Hello I am an Employee");
    }
}
