package com.company;

public class Main {

    public static void main(String[] args) {
        //let's go over some method overloading
        int newScore = calculateScore("Greg", 300);
        System.out.println("newScore is " + newScore);
        int newScore2 = calculateScore(12);
        System.out.println("newScore is " + newScore2);
        calculateScore();

        calcFeetAndInchesToCentimeters(5, 10);
        calcFeetAndInchesToCentimeters(75); //overloaded method call


    }

    public static int calculateScore (String playerName, int score) {
        System.out.println("Player " + playerName +" scored " + score + " points");

        return score * 1000;
    }

    public static int calculateScore (int score) { //this is going to be my overloaded method
        System.out.println("Unnamed player scored " + score + " points");

        return score * 1000;
    }

    public static int calculateScore () { //this is going to be my second overloaded method
        System.out.println("Unnamed player, no player score");

        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || ((inches <0) && (inches > 12))) {
            System.out.println("Invalid perameter");
            return -1;
        }

        double centimeters = (feet * 12 * 2.54) + (inches * 2.54);
        System.out.println(feet + " feet " + inches + " inches equals " + centimeters + " centimeters");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double feet = (int)inches / 12;
        double remainingInches = (int)inches % 12;
        calcFeetAndInchesToCentimeters(feet, remainingInches);
        return 0;
    }
}
