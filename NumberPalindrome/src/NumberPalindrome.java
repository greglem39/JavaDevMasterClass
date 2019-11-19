public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        int temp = number;
        int reverse = 0;

        while (temp > 0){
            reverse = (reverse * 10) + (temp % 10); //getting the reverse of the number
            temp /= 10;
        }

        return reverse == number;
    }
}
