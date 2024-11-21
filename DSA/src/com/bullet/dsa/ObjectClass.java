package com.bullet.dsa;
/**
 * @author brilliant
 * @author com.bullet
 * @since 21-11-2024
 * */

/*
* This class dives deep with the Object class in Java. The Object class is the
* superclass of all classes (either directly or indirectly) in Java and
* is at the heart of inheritance*/

public class ObjectClass {
    private Object object;

    public ObjectClass() {
        object = new Object();
    } // end of constructor

    /* The method returns name of the class to which an object belongs*/
    public String getClassName() {
        return object.getClass().getName();
    }
    public Class myClass() {
        return object.getClass();   /* the getClass method returns a runtime representation
                                    of the class of an object. It returns a class object*/
    }

    public static void main(String[] args) {
        ObjectClass object = new ObjectClass();
        System.out.println(object.getClassName());  // java.lang.Object
        Class myClass = object.myClass();   /* we can query the class object for a variety of information
                                            such as name, superclass, names of interfaces it implements,
                                            among other things*/
        System.out.println(myClass);    /* class java.lang.Object
                                        */
    }
}
