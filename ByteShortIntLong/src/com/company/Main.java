package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE; //using integer because it is a wrapper
        int myMaxIntValue = Integer.MAX_VALUE; //gives us ways to perform diff operations on an int

        System.out.println("Integer Minimum Value " + myMinIntValue);
        System.out.println("Integer Maximum Value " + myMaxIntValue);


        System.out.println("Busted Max = " + (myMaxIntValue + 1));
        System.out.println("Busted Min = " + (myMinIntValue - 1));

        int myMaxIntTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte min: " + myMinByteValue);
        System.out.println("Byte max: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short min: " + myMinShortValue);
        System.out.println("Short max: " + myMaxShortValue);

        long myLongValue = 100L;

        long bigLongLiteralValue = 2147483647234L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long min: " + myMinLongValue);
        System.out.println("Long max: " + myMaxLongValue);
        System.out.println(bigLongLiteralValue);

        byte myNewByteValue = (byte)(myMinByteValue/2);

        System.out.println(myNewByteValue);

        short myNewShortValue = (short)(myMinShortValue/2);

        System.out.println(myNewShortValue);

        byte challengeByte = 44;

        int challengeInt = 999;

        short challengeShort = 889;

        long challengeLong = 50000L + 10 * (challengeByte + challengeInt + challengeShort);

        System.out.println(challengeLong);
    }
}
