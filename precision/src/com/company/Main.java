package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float min value: " + myMinFloatValue);
        System.out.println("Float max value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double min value: " + myMinDoubleValue);
        System.out.println("Double max value: " + myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue = 5f/3f; //fuck it, don't use floats, they're dumb
        double myDoubleValue = 5d/3d;

        System.out.println("My int value: " + myIntValue);
        System.out.println("My double value: " + myDoubleValue);
        System.out.println("My float value: " + myFloatValue);

        double converter = 0.45359237d;
        double poundToKilo = 4 * converter;
        System.out.println(poundToKilo + "kg");

        double pi = (double) 3.1415927;

        System.out.println(pi);

        //note BigDecimal is better to use for large calculations.

    }
}
