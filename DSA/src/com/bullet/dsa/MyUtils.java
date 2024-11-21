package com.bullet.dsa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author brilliant
 * @author com.bullet
 * @since 21-11-2024
 * */

public class MyUtils {
    public static void swap(int first, int second) {
        // swap any two values
        int temp = first;
        first = second;
        second = temp;
    }

    public static int max(int[] array) {
        // return the maximum value
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }

        return max;
    }

    public static int min(int[] array) {
        // return the minimum value
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        return min;
    }

    public static void sort() {
        // sort the values provided
    }

    // method returns the index of the item when found, and -1 if it is not found
    public static int search(int value, int[] array) {
        // search for a given value
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) return i;

        }
        return -1;
    }
    public static BufferedReader readLines() throws IOException {
        //int[] numbers;
        File file = new File("DSA/src/com/bullet/dsa/numbers.txt");
        FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        //String input = br.readLine();
        //numbers = numberArrayFromString(input);
        return br;
    }
    public List<String> readLine(BufferedReader reader) throws IOException {
        List listOfStrings = new ArrayList<>();

        listOfStrings.add(reader.readLine());
        return listOfStrings;

    }
    public static int[] numberArrayFromString(String input) {
        int[] numbers;
        String[] str = input.replaceAll(" ", ",").split(",");
        numbers = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            numbers[i] = Integer.parseInt(str[i]);
        }
        return numbers;
    }
    // print out the integers of an array
    static void printNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }


}
