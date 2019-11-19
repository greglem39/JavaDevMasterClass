package com.company;

public class Main {


    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        String playerName = "Greg";

        int highScore = calculateScore(true, 800, 5, 100); //can assign to var
        System.out.println("Your final score is  " + highScore);

        int secondHigh = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score is  " + secondHigh);

        int myPos = calculateHighScorePosition(highScore); //assign to a var so we can use for display
        displayHighScorePosition(playerName, myPos);

        myPos = calculateHighScorePosition(1000); //assign to a var so we can use for display
        displayHighScorePosition("Bob", myPos);

        myPos = calculateHighScorePosition(400); //assign to a var so we can use for display
        displayHighScorePosition("Bill", myPos);

        myPos =calculateHighScorePosition(50); //assign to a var so we can use for display
        displayHighScorePosition("Rosemary", myPos);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1; //need this to show what happens if gameOver is false, or the method breaks
        }

    }

    public static void displayHighScorePosition(String playerName, int scoreboardPos) {
        System.out.println(playerName + " managed to get into position " + scoreboardPos + " on the high score table.");
    }

    public static int calculateHighScorePosition(int highScore) {
        int scoreboardPos;
        if (highScore >= 1000) { //run through if else to assign positioning
            scoreboardPos = 1; // could've just done return 1
            return scoreboardPos;
        } else if (highScore >= 500){
            scoreboardPos = 2;
            return scoreboardPos;

        } else if (highScore >= 100) {
            scoreboardPos = 3;
            return scoreboardPos;
        } else {
            scoreboardPos = 4;
            return scoreboardPos;
        }
    }

}
