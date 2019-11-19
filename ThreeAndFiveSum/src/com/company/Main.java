//from 1 to 1000, let's see if we can sum up some numbers divisible by 3 and 5

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        int sumCount = 0;
        for (int i = 1; i <= 1000; i++) {
            if((i % 3 == 0) && (i % 5 == 0)){
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
}
