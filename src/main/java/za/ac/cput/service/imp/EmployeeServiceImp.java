package za.ac.cput.service.imp;

import za.ac.cput.domain.Employee;
import za.ac.cput.repository.EmployeeRepository;
import za.ac.cput.repository.impl.EmployeeRepoImp;
import za.ac.cput.repository.impl.EmployeeRepoImp;
import za.ac.cput.service.EmployeeService;
import za.ac.cput.service.EmployeeService;

import java.util.Set;

public class EmployeeServiceImp implements EmployeeService {

    private static EmployeeServiceImp service = null;
    private EmployeeRepository repository;

    private EmployeeServiceImp(){
        this.repository = EmployeeRepoImp.getRepository();
    }

    public static EmployeeServiceImp getService(){
        if (service == null) service = new EmployeeServiceImp();
        return service;
    }
    @Override
    public Employee create(Employee employee) {
        return this.repository.create(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return this.repository.update(employee);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Employee read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Employee> getAll() {
        return this.repository.getAll();
    }

}
