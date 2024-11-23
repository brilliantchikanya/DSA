package com.bullet.dsa;

import java.util.Objects;

/**
 * @author brilliant
 * @author com.bullet
 * @since 21-11-2024
 * */

public class Name {
    String firstName;
    String secondName;
    String lastName;

    // constructors
    public Name() {
        firstName = "";
        secondName = "";
        lastName = "";
    }
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
    } // end of constructors

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(firstName, name.firstName) && Objects.equals(lastName, name.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + secondName + " " + lastName;
    }
}
