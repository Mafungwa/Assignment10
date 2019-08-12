package za.ac.cput.service.imp;


import za.ac.cput.domain.Gender;
import za.ac.cput.repository.GenderRepository;
import za.ac.cput.repository.impl.GenderRepoImp;
import za.ac.cput.repository.impl.GenderRepoImp;
import za.ac.cput.service.GenderService;
import za.ac.cput.service.GenderService;

import java.util.Set;

public class GenderServiceImp implements GenderService {

    private static GenderServiceImp service = null;
    private GenderRepository repository;

    private GenderServiceImp() {
        this.repository = GenderRepoImp.getRepository();
    }

    public static GenderServiceImp getService() {
        if (service == null) service = new GenderServiceImp();
        return service;
    }

    @Override
    public Gender create(Gender gender) {
        return this.repository.create(gender);
    }

    @Override
    public Gender update(Gender gender) {
        return this.repository.update(gender);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Gender read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Gender> getAll() {
        return this.repository.getAll();
    }

}
