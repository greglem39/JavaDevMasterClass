package com.company;

public class Main {

    public static void main(String[] args) {

        double myValue = 20.00d;

        double mySecondValue = 80.00d;

        double thirdValue = (myValue + mySecondValue) * 100.00d;

        System.out.println(thirdValue); //I'm going to be checking my values just to be sure.

        double remainder1 = thirdValue % 40.00d;

        System.out.println(remainder1); //this is just a test

        boolean isZero = (remainder1 == 0) ? true : false;

        System.out.println(isZero);

        if (!isZero) {
            System.out.println("Got some remainder!");
        } else {
            System.out.println("No remainder. Move along, citizen.");
        }

    }
}
