package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 ==  0){ //multiple of 3 and 5 - print FizzBuzz
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0){ //multiple of 5 - print Buzz
                System.out.println("Buzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz"); //multiple of 3 - print Fizz
            } else {
                System.out.println(i);
            }
        }
    }
}
