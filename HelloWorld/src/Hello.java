import java.sql.SQLOutput;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.print("Hello ");
        System.out.println("world!");

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = mySecondNumber + myFirstNumber + myThirdNumber;

        System.out.println("The sum of your three numbers is: " + myTotal);

        int myLastOne = 1000 - myTotal;

        System.out.println(myLastOne);

        //can shorthand System.out.println with sout -> intellij will automatically generate the command12

        //inputting a name

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = scan.nextLine();

        System.out.println("Your name is " + name);

    }
}