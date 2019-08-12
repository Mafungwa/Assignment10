package za.ac.cput.repository;

import za.ac.cput.domain.Gender;

import java.util.Map;
import java.util.Set;

public interface  GenderRepository extends MRepository<Gender, String> {

    Set<Gender> getAll();

}
