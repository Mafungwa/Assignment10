package za.ac.cput.service;

import za.ac.cput.domain.Race;

import java.util.Set;

public interface RaceService extends MService<Race, String>{

    Set<Race> getAll();
}
