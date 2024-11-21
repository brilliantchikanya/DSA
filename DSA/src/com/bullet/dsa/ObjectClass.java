package com.bullet.dsa;
/**
 * @author brilliant
 * @author com.bullet
 * @since 21-11-2024
 * */

/*
* This class looks at the Object class in Java*/
public class ObjectClass {
    private Object object;

    public ObjectClass() {
        object = new Object();
    } // end of constructor

    /* The method returns name of the class to which an object belongs*/
    public String getClassName() {
        return object.getClass().getName();
    }

    public static void main(String[] args) {
        ObjectClass object = new ObjectClass();
        System.out.println(object.getClassName());
    }
}
