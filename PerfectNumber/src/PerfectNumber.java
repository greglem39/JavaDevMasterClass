public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if (number < 1){
            return false; //can't be less than 1
        }

        int sum = 0; //placeholder for our test

        for (int i = 1; i < number; i++){
            if (number % i == 0){
                sum += i; //add it to the sum
                System.out.println(sum);
            }
        }

        if (sum == number){ //if the sum is equal to the number, it's a perfect number
            return true;
        } else {
            return false;
        }
    }
}