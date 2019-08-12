package za.ac.cput.factories;

import za.ac.cput.domain.Gender;

public class GenderFactory {

    public static Gender getGender(String gender){
        return new Gender.Builder().gender(gender)
                .build();
    }

}
