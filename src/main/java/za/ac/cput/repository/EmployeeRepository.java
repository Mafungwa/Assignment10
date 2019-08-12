package za.ac.cput.repository;


import za.ac.cput.domain.Employee;

import java.util.Map;
import java.util.Set;


public interface  EmployeeRepository extends MRepository<Employee, String>  {

    Set<Employee> getAll();

}
