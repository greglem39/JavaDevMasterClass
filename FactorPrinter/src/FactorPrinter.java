public class FactorPrinter {
    public static void printFactors(int number){
        int temp = 1; // this is going to be our placeholder for the factor iteration

        if (number < 1){
            System.out.println("Invalid Value"); //handle the invalid case
        }

        while (temp <= number){
            if (number % temp == 0){ //if it divides in evenly, we want to print the number
                System.out.println(temp);
            }
            temp++; //iterate to the next number
        }
    }
}
