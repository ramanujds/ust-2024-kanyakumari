package com.ust.employeehierarchy;

import com.ust.employeehierarchy.model.Developer;
import com.ust.employeehierarchy.model.Employee;
import com.ust.employeehierarchy.model.Manager;
import com.ust.employeehierarchy.service.EmployeeManagementService;
import com.ust.employeehierarchy.service.EmployeeManagementServiceImpl;

public class Main {
    public static void main(String[] args) {

        Employee d1 = new Developer(102,"Karan",98000,"Java");

        EmployeeManagementService service = new EmployeeManagementServiceImpl();

        service.registerEmployee(d1);


    }
}