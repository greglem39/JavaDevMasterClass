package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        int value = 3; //a test value
//        if (value ==  1) {
//            System.out.println("value was 1");
//        } else if (value == 2) {
//            System.out.println("value was 2");
//        } else {
//            System.out.println("not 1 or 2");
//        }

        int switchValue = 4;

        switch(switchValue){
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("value was 3 or 4 or 5");
                System.out.println("actually it was a " + switchValue);
                break;
            default:
                System.out.println("not a defined value case");
                System.out.println("was actually a " + switchValue);
                break;
        }

        char switchChar = 'Q'; //practice with char

        switch(switchChar) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            case 'E':
                System.out.println("E");
                break;
            default:
                System.out.println("Not ABCDE");
                System.out.println("It was actually " + switchChar);
                break;
        }

        String switchString = "FEBRUARY"; //string practice

        switch(switchString.toLowerCase()) {
            case "january":
                System.out.println("January");
                break;
            case "february":
                System.out.println("February");
                break;
            case "march":
                System.out.println("March");
                break;
            default:
                System.out.println("Dunno");
                System.out.println("Actually " + switchString);
                break;
        }

    }
}
