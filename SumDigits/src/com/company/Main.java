package com.company;

public class Main {

    public static void main(String[] args) {
        //testing with static values
        sumDigits(125);
        sumDigits(99);
        sumDigits(999999999);
        sumDigits(-9);
    }

    public static int sumDigits(int number) {
        if (number < 10){
            return -1;
        }

        int sum = 0;

        //extracting least significant digit from, say 125
        while (number > 0){
            int digit = number % 10;
            sum += digit;
            number = number/10;
        }
        System.out.println(sum);
        return sum;
    }
}
