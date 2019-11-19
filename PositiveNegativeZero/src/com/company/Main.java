package com.company;

public class Main {

    //practice exercise - create a method that tests if a number is pos, neg, or zero, and print the result
    //use a void method, you're not returning a number

    public static void main(String[] args) {

        checkNumber(5);
        checkNumber(-2);
        checkNumber(0);
        checkNumber(100);


    }

    public static void checkNumber(int number) {

        if (number > 0) {
            System.out.println("positive");
        } else if (number == 0 ) {
            System.out.println("zero");
        } else {
            System.out.println("negative");
        }

    }

}
