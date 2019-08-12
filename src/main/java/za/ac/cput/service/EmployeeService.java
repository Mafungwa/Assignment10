package za.ac.cput.service;

import za.ac.cput.domain.Employee;

import java.util.Set;

public interface EmployeeService extends MService<Employee, String> {

    Set<Employee> getAll();

}
