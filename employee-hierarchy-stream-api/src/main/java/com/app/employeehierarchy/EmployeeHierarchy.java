package com.app.employeehierarchy;


import com.app.employeehierarchy.model.Developer;
import com.app.employeehierarchy.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeHierarchy {

    // DONE: Use Stream API to find the employee with the highest salary
    public static Employee findHighestPaidEmployee(List<Employee> employees) {

        return employees.stream().max((e1,e2)->Double.compare(e1.getSalary(),e2.getSalary()))
                .get();

    }


    // TODO: Use Stream API to count the number of developers in the collection
    public static long countDevelopers(List<Employee> employees) {

       return employees.stream().filter(e->e instanceof Developer).count();

    }

    // TODO: Use Stream API to calculate the average salary of all employees
    public static double calculateAverageSalary(List<Employee> employees) {
      return employees.stream().mapToDouble(Employee::getSalary).average().orElse(0);

     // return employees.stream().map(e->e.getSalary()).reduce(0.0,(a,b)->a+b)/employees.size();
    }


    public static void main(String[] args) {
        // Create a collection to store employees
        List<Employee> employeeList = new ArrayList<>();

        // TODO: Add sample Manager and Developer instances to the collection

        // TODO: Print the initial list of employees

        // TODO: Use Stream API to filter employees based on salary range and display the results

        // TODO: Use Stream API to calculate the total salary of all employees

        // TODO: Allow user input to add new employees to the collection

        // TODO: Implement a user interface to interact with the program
    }
}
