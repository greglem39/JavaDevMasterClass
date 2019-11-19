//do the first two numbers' sum equal the third number you input?
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Pick a number! "); //prompting to give me a number
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();

        System.out.println("Pick a second number! ");
        int num2 = input.nextInt();

        System.out.println("Pick a third number! ");
        int num3 = input.nextInt();

        boolean result = EqualSumChecker.hasEqualSum(num1,num2,num3);
        System.out.println(result);

        //ignore my test case below
//        boolean result = EqualSumChecker.hasEqualSum(1,2,3);
//        System.out.println(result);
    }
}
