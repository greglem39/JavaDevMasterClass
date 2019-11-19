//this is where I will test to see if my method adds the even integers of a number together correctly

public class Main {
    public static void main(String[] args) {
        int result = EvenDigitSum.getEvenDigitSum(252);
        System.out.println(result);
        result = EvenDigitSum.getEvenDigitSum(-93245);
        System.out.println(result);
        result = EvenDigitSum.getEvenDigitSum(123456789);
        System.out.println(result);

    }
}
