package com.bullet.dsa;

/**
 * @author brilliant
 * @author com.bullet
 * @since 21-11-2024
 * */

public class Person {
    Name name;
    Gender gender;
    //Address address;
    MyDate dob;

    public Person() {

    } // end of constructor

    enum Gender {
        MALE,
        FEMALE;
    }

    // method calculates and returns the age of a person
    private int getAge() {
        return 0;
    }
}
