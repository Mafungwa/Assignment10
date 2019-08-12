package za.ac.cput.repository;

import za.ac.cput.factories.*;
import za.ac.cput.domain.Gender;
import za.ac.cput.repository.GenderRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.repository.impl.GenderRepoImp;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderRepoImpTest {

    private GenderRepository repository;
    private Gender gender;

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepoImp.getRepository();
        this.gender = GenderFactory.getGender("Male");
    }

    @Test
    public void create() {
        Gender genders = this.repository.create(this.gender);
        Assert.assertSame(genders,this.gender);
        getAll();
    }

    @Test
    public void update() {
        String male = "Male";
        Gender gender = new Gender.Builder().gender(male).build();
        this.repository.update(gender);
        Assert.assertSame(male, gender.getGender());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(gender.getGender());
        getAll();
    }

    @Test
    public void read() {
        //Gender gender = this.repository.gender.getGender();
        //getAll();
    }

    @Test
    public void getAll() {
        Set<Gender> all = this.repository.getAll();
    }


}
