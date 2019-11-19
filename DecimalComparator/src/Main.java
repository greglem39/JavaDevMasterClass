//are these two numbers equal  to  three decimal places???
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Pick a number up to 3 decimal places! "); //prompting to give me a number
        Scanner input = new Scanner(System.in);
        double firstDouble = input.nextDouble();

        System.out.println("Pick a seccond number up to 3 decimal places! "); //now gimme a second
        Scanner secondInput = new Scanner(System.in);
        double secondDouble = secondInput.nextDouble();

        boolean result = DecimalComparator.areEqualByThreeDecimalPlaces(firstDouble, secondDouble);
        System.out.println(result);

        //below is just a test case
//        result = DecimalComparator.areEqualByThreeDecimalPlaces(2.001, 2.002);
//
//        System.out.println(result);
    }
}
