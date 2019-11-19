import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("How many kilobytes do you have? ");
        Scanner input = new Scanner(System.in);
        int myKiloBytes = input.nextInt();

        MegaBytesConverter.printMegaBytesAndKiloBytes(myKiloBytes);

    }
}
