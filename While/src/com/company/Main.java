package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count =0;
        while (count != 39){ //we want this to stop once count hits a value and maybe we don't know how many loops that will be
                            //so  we use  while
            System.out.println(count);
            count++;
        }

        System.out.println("*************");

        //another way
        count = 1;
        while(true){
            if(count ==6){
                break;
            }
            System.out.println(count);
            count++;
        }

        System.out.println("*************");
        count = 1;
        //do while
        do { //do will ALWAYS execute once
            System.out.println(count);
            count++;
        } while(count !=6);

        int number = 4;
        int finNumber=22;
        int totalEven = 0;//placeholder

        while (number <= finNumber){ //we want even numbers in a range but we want to break out when we hit five
            number++;
            if (!isEven(number)){
                continue;
            }

            System.out.println("Even number " + number);


            totalEven++;

            if(totalEven >= 5){
                break;
            }


        }

        System.out.println("Total even numbers found = " + totalEven);

    }

    public static boolean isEven(int num){
        if (num % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
