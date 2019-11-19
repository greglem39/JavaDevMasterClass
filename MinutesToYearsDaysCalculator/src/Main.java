import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Please enter the number of minutes: ");
        Scanner input = new Scanner(System.in);
        long minutes = input.nextLong();

        MinutesToYearsDaysCalculator.printYearsAndDays(minutes);

//        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
//        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);

    }
}
