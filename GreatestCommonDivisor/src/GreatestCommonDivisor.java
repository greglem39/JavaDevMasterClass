public class GreatestCommonDivisor {

    //goal is to find the greatest common divisor between two ints
    public static int getGreatestCommonDivisor(int first, int second){

        if (first < 10 || second < 10){
            return -1; //indicates invalid value
        }

        int gcd = 1; //1 will always divide into both numbers, and we cannot start at 0

        for (int i = 1; i <= first && i <= second; i++){ //we cannot break the boundaries of our numbers
            if (first % i == 0 && second % i == 0){
                gcd = i; //i will be the new gcd

            }
        }

        return gcd;
    }
}
