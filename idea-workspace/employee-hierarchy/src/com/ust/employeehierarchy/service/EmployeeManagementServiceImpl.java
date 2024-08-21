package com.ust.employeehierarchy.service;

import com.ust.employeehierarchy.model.Employee;

public class EmployeeManagementServiceImpl implements EmployeeManagementService{

    public void registerEmployee(Employee employee) {
        System.out.println("Employee : "+employee.getName()+" Registered");
    }

    public void removeEmployee(int id) {
        System.out.println("Employee : "+id+" Removed");
    }
}
