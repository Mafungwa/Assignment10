package za.ac.cput.factories;

import za.ac.cput.domain.Employee;
import za.ac.cput.domain.Gender;
import za.ac.cput.domain.Race;
import za.ac.cput.util.Misc;


public class EmployeeFactory {

    public static Employee getEmployee(String first_name, String last_name,String race, String gender){
        Race r = RaceFactory.getRace(race);
        Gender sex = GenderFactory.getGender(gender);
        return new Employee.Builder().emp_id(Misc.generateId())
                .first_name(first_name)
                .last_name(last_name)
                .race(r)
                .gender(sex)
                .build();

    }

}
