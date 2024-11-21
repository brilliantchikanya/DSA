package com.bullet.dsa;

import java.util.Random;

/**
 * @author brilliant
 * @author com.bullet
 * @since 21-11-2024
 * */
/*
* This class abstracts the concept of a dice, which can be thrown and
*  gives a value between 1 and 6*/
public class Dice {

    public Dice() {
        //
    } // end of constructor

    // this method must return values between 1 and 6 inclusive randomly
    public static int rollDie() {
        Random random = new Random();
        int result = random.nextInt(7); //TODO: this can return 0, so need to find a solution to this

        return result;
    }

    public static void main(String[] args) {
        int value = Dice.rollDie();
        System.out.println(value + " ");
    }
}
