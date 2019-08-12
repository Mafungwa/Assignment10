package za.ac.cput.repository;

import za.ac.cput.factories.*;
import za.ac.cput.domain.Employee;
import za.ac.cput.repository.EmployeeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.repository.impl.EmployeeRepoImp;

import java.util.Set;

import static org.junit.Assert.*;


public class EmployeeRepoImpTest {

    private EmployeeRepository repository;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRepoImp.getRepository();
        this.employee = EmployeeFactory.getEmployee("Pule","Mafungwa","African","Male");
    }

    @Test
    public void create() {
        Employee emp = this.repository.create(this.employee);
        getAll();
        Assert.assertSame(emp,this.employee);
    }

    @Test
    public void update() {
        String lname = "Mafungwa";
        String name = "Pule";
        String race = "African";
        String gender = "Male";
        Employee employees = new Employee.Builder().first_name(name).last_name(lname).build();
        this.repository.update(employees);
        Assert.assertSame(lname, employees.getLast_name());
        Assert.assertSame(name, employees.getFirst_name());
    }

    @Test
    public void delete() {
        this.repository.delete(employee.getFirst_name());
        this.repository.delete(employee.getLast_name());
    }

    @Test
    public void read() {
        Employee read = this.repository.read(employee.getFirst_name());
        getAll();
        assertNotEquals(employee, read);
    }

    @Test
    public void getAll() {
        Set<Employee> getAll = this.repository.getAll();
    }


}
