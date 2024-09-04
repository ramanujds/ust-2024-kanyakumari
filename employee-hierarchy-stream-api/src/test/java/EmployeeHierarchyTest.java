import com.app.employeehierarchy.EmployeeHierarchy;
import com.app.employeehierarchy.model.Developer;
import com.app.employeehierarchy.model.Employee;
import com.app.employeehierarchy.model.Manager;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeHierarchyTest {

    // Write test cases to verify the functionality of the EmployeeHierarchy class

    @Test
    public void testFindHighestPaidEmployee() {
        // Create a collection to store employees
        List<Employee> employeeList = new ArrayList<>();

        // Add sample Manager and Developer instances to the collection
        employeeList.add(new Manager(1, "John", 100000, 10));
        employeeList.add(new Developer(2, "Alice", 80000, "Java"));
        employeeList.add(new Developer(3, "Bob", 90000, "Python"));

        // Verify the highest paid employee
        assertEquals("John", EmployeeHierarchy.findHighestPaidEmployee(employeeList).getName());
    }

    @Test
    public void testCountDevelopers() {
        // Create a collection to store employees
        List<Employee> employeeList = new ArrayList<>();

        // Add sample Manager and Developer instances to the collection
        employeeList.add(new Manager(1, "John", 100000, 10));
        employeeList.add(new Developer(2, "Alice", 80000, "Java"));
        employeeList.add(new Developer(3, "Bob", 90000, "Python"));

        // Verify the number of developers
        assertEquals(2, EmployeeHierarchy.countDevelopers(employeeList));
    }


    @Test

    public void testCalculateAverageSalary() {
        // Create a collection to store employees
        List<Employee> employeeList = new ArrayList<>();

        // Add sample Manager and Developer instances to the collection
        employeeList.add(new Manager(1, "John", 100000, 10));
        employeeList.add(new Developer(2, "Alice", 80000, "Java"));
        employeeList.add(new Developer(3, "Bob", 90000, "Python"));

        // Verify the average salary
        assertEquals(90000, EmployeeHierarchy.calculateAverageSalary(employeeList));
    }






}
