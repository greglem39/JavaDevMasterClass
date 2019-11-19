package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
	// write your code here
        System.out.println(getDurationString(65, 45));

        System.out.println(getDurationString(3945L));
    }

    private static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long remainingMinutes =  minutes % 60;

        //above is the standard calculation

        //below, we go through turning the hours, minutes, and seconds into strings to be concatinated
        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = minutes + "m";
        if (minutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "m";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        //above if statements can be better optimized. Something to look into as I go on in the course.

        return hoursString + " " + minutesString + " " + secondsString + ".";

    }

    private static String getDurationString(long seconds){
        if (seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds /60;
        long remainingSeconds = seconds % 60;

        //call the previously overloaded method®
        return getDurationString(minutes, remainingSeconds);

    }

}
