package com.ust.employeehierarchy.service;

import com.ust.employeehierarchy.model.Employee;

public interface EmployeeManagementService {

   void registerEmployee(Employee employee);
   void removeEmployee(int id);

}
