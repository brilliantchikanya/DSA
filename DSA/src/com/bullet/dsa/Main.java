package com.bullet.dsa;

import java.io.*;

import static com.bullet.dsa.MyUtils.*;

/**
 * @author brilliant
 * @author com.bullet
 * @since 21-11-2024
 * */

public class Main {
    public static void main(String[] args) throws IOException {
        String input = readLines().readLine();

        int[] array = MyUtils.numberArrayFromString(input);
        printNumbers(array);
        //System.out.println(" ");
        //int x = 5;

        //System.out.println("x is " + x);


        //int y = 7;
        //System.out.println("y is " + y);

        //MyUtils.swap(x, y);
        //System.out.println("");

        //System.out.println("x is now " + x);
        //System.out.println("y is now " + y);

        int maximum = MyUtils.max(array);
        System.out.println("The maximum value in the array is " + maximum);

        int minimum = MyUtils.min(array);
        System.out.println("The minimum value in the array is " + minimum);


        int toSearch = 10;
        int index = MyUtils.search(toSearch, array);
        if (index == -1) {
            System.out.println("The value " + toSearch + " is not in the array");
        }
        else {
            System.out.println("The value " + toSearch + " is in the array at position " + index );
        }

    }
}
