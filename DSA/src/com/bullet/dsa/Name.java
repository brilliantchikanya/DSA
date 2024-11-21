package com.bullet.dsa;

/**
 * @author brilliant
 * @author com.bullet
 * @since 21-11-2024
 * */

public class Name {
    String firstName;
    String secondName;
    String lastName;

    public Name(String firstName) {
        this.firstName = firstName;
        secondName = "";
        lastName = "";
    }

    public Name(String firstName, String lastName) {
        this(firstName);
        secondName = "";
        this.lastName = lastName;

    }

    public Name(String firstName, String secondName, String lastName) {
        this(firstName);
        this.secondName = secondName;
        this.lastName = lastName;
    } // end of constructor




    public String toString() {
        return firstName + " " + secondName + " " + lastName;
    }
}
