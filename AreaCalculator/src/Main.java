import java.util.Scanner;
//I decided to customize my hard coded area calculator with some input just to practice some things further on
//in the course
public class Main {
    public static void main(String[] args) {

        System.out.println("Please enter your radius: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();

        double areaOfCircle = AreaCalculator.area(radius); //call single perameter method
        System.out.println("The area of your circle is " + areaOfCircle);

        System.out.println("Please enter your base: ");
        Scanner input2 = new Scanner(System.in);
        double base = input2.nextDouble();

        System.out.println("Please enter your height: ");
        Scanner input3 = new Scanner(System.in);
        double height = input3.nextDouble();

        double areaOfRect = AreaCalculator.area(base, height); //call double perameter method
        System.out.println("The area of your rectangle is " + areaOfRect);
    }
}
