package za.ac.cput.repository;

import za.ac.cput.domain.Race;

import java.util.Map;
import java.util.Set;

public interface  RaceRepository extends MRepository<Race, String> {
    Set<Race> getAll();
}
