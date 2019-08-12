package za.ac.cput.service.imp;

import za.ac.cput.domain.Race;
import za.ac.cput.repository.RaceRepository;
import za.ac.cput.repository.impl.GenderRepoImp;
import za.ac.cput.repository.impl.RaceRepoImp;
import za.ac.cput.service.RaceService;
import za.ac.cput.service.RaceService;

import java.util.Set;

public class RaceServiceImp implements RaceService {

    private static RaceServiceImp service = null;
    private RaceRepository repository;

    private RaceServiceImp(){
        this.repository = RaceRepoImp.getRepository();
    }

    public static RaceServiceImp getService(){
        if (service == null) service = new RaceServiceImp();
        return service;
    }
    @Override
    public Race create(Race race) {
        return this.repository.create(race);
    }

    @Override
    public Race update(Race race) {
        return this.repository.update(race);
    }

    @Override
    public void delete(String i) {
        this.repository.delete(i);
    }

    @Override
    public Race read(String i) {
        return this.repository.read(i);
    }

    @Override
    public Set<Race> getAll() {
        return this.repository.getAll();
    }

}
