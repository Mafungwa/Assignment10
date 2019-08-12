package za.ac.cput.factories;

import za.ac.cput.domain.Race;

public class RaceFactory {

    public static Race getRace(String race){
        return new Race.Builder().race(race)
                .build();
    }

}
