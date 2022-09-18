package L.Nikolay.profjd10_0_hw2_5.services;

import L.Nikolay.profjd10_0_hw2_5.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addNewEmployee(String firstName, String lastName);

    Employee deleteEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);

    List printAllEmployees();
}
