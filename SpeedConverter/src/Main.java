import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Please input a speed (in km/hr) that you'd like to convert to mi/hr: ");
        Scanner input = new Scanner(System.in);
        double mySpeed = input.nextInt();

        SpeedConverter.printConversion(mySpeed);


    }

}
