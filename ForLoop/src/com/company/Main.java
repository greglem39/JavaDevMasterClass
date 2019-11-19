package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        for(int i=2; i <= 8; i++){
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }

        System.out.println("************************************************");

        for(int i =8; i > 1; i--){
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }

        System.out.println("************************************************");

        int primeCount = 0;
        for(int i = 10; i < 50; i++){
            if(isPrime(i)){
                primeCount++;
                System.out.println(i + " is a prime number");
                if(primeCount == 10){
                    System.out.println("Exiting loop");
                    break;
                }
            }
        }

        int sum = 0;
        int sumCount = 0;
        for (int i = 1; i <= 1000; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                sum += i;
                sumCount++;
                System.out.println(i);
                if (sumCount == 5) {
                    System.out.println("Exiting loop");
                    break;
                }
            }
        }
        System.out.println("Sum is " + sum);
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++){ //from i to sqrt of n, increment through
            if (n % i == 0) { //if it's divisible by i, we don't want it
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

}
