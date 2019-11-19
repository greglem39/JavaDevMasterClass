package com.company;

public class Main {

    public static void main(String[] args) {

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens!");
        } else {
            System.out.println("It's an alien!!!!!");
        }

        int topScore = 80;
        if (topScore <= 100) {

            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {

            System.out.println("Greater than second top score and less than 100");

        }

        boolean isCar = true;

        if (isCar) { //can use !isCar to be the opposite - it's the not operator
            System.out.println("Blah de blah de blah");
        }

        boolean wasCar = isCar ? true : false;

        if (wasCar) {
            System.out.println("This is true.");
        }


    }
}
