package com.company;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D'; //char stores only one character, but is 16 bits

        char myUnicodeChar = '\u0044';

        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        int customerAge = 23;

        boolean isCustomerOverTwentyOne = true;

        if (customerAge < 21) {
            isCustomerOverTwentyOne = false;
        }

        if (isCustomerOverTwentyOne) {

            System.out.println("Sure, you can have a beer.");
        }

    }
}
