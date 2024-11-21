package com.bullet.dsa;

import java.util.Objects;

/**
 * @author brilliant
 * @author com.bullet
 * @since 21-11-2024
 * */

public class Person {
    Name name;
    Gender gender;
    MyDate dateOfBirth;


    public Person(Name name, Gender gender) {
        this.name = name;
        this.gender = gender;
        dateOfBirth = null;
    }

    public Person() {
        name = null;
        gender = null;
        dateOfBirth = null;

    } // end of constructor


    /* Two important methods which must be overridden, the equals method and
    *  the toString, and the hashCode as well*/
    @Override
    public boolean equals(Object comparisonObject) {
        if (this == comparisonObject) return true;
        if (comparisonObject == null || getClass() != comparisonObject.getClass()) return false;
        Person person = (Person) comparisonObject;
        return Objects.equals(name, person.name) && gender == person.gender;
    }

    @Override
    public String toString() {
        return name + " " + getGender();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender);
    }

    // beginning of getter and setter methods
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public MyDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(MyDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }   // end of getter and setter methods



    // method calculates and returns the age of a person
    private int getAge() {
        // TODO
        return 0;
    }

    public static void main(String[] args) {
        Name myName = new Name("Trevor");
        Person person = new Person(myName, Gender.MALE);
        System.out.println(person); // Trevor   MALE
    }
}
