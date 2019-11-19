public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        int sum = 0;//placeholder for sum
        int remainder = 0; //placeholder for my remainder values


        if (number < 0){
            return -1;
        } else {
            while (number !=0) {
                remainder = number % 10; //extract last int
                if (remainder % 2 == 0){ //we only want to add even numbers
                    sum += remainder; //add to sum
                }
                number /= 10; //move to the next digit on next loop
            }
        }

        return sum;
    }
}
