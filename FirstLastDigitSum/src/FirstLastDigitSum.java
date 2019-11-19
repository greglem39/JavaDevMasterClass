public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){

        int firstDigit = 0;
        int lastDigit = 0;

        lastDigit = number % 10; // getting the first digit
        //System.out.println(firstDigit);

        if (number < 0){
            return -1;
        } else if (number >= 0 && number <= 9) {
            firstDigit = lastDigit; //the first digit is the last digit
        } else {
            while (number > 9){
                number /= 10;
            }
            firstDigit = number;
        }
        return firstDigit + lastDigit; //add the digits together
    }
}