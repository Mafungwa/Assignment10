package za.ac.cput.service;

import za.ac.cput.domain.Gender;

import java.util.Set;

public interface GenderService extends MService<Gender, String>{

    Set<Gender> getAll();
}
