package employee;

import com.app.employeehierarchy.model.Employee;
import com.app.employeehierarchy.model.Executive;
import com.app.employeehierarchy.model.Manager;

import java.util.ArrayList;
import java.util.List;

public class EmployeeHierarchyService {

    private List<Employee> employees;

    public EmployeeHierarchyService(){
        this.employees=new ArrayList<>();
    }

    // Todo: Implement a method to add an employee to the system.
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Todo: Implement a method to get an employee by ID.
    public Employee getEmployeeById(int employeeId) {
        return employees.stream().filter(e->e.getId()==employeeId)
                .findFirst().get();
    }

    // Todo: Implement a method to calculate total salary expenditure.
    public double calculateTotalSalaryExpenditure() {
         return employees.stream().mapToDouble(Employee::getSalary).sum();
    }

    // Todo: Implement additional methods for employee management.

    // Todo: Implement a method to pay increment to employees based on their type
    // Manager: 15% increment
    // Executive: 10% increment
    // Regular Employee: 5% increment

    public void incrementSalary(){
        employees.forEach(
                e->{
                    switch (e){
                        case Manager obj -> obj.setSalary(obj.getSalary()*1.15);
                        case Executive obj -> obj.setSalary(obj.getSalary()*1.1);
                        default -> e.setSalary(e.getSalary()*1.05);
                    }

//                    if(e instanceof Manager m){
//                        m.play();
//                    }

                }
        );
    }





}
