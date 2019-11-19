public class NumberToWords {

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }

        int temp = 0; //placeholder
        int num = number;//placeholder for number

        int digitCount = getDigitCount(number); //getting the total number of digits
        System.out.println("Digit count is " + digitCount);

        while (num > 0){
            temp = (temp * 10) + (num % 10);
            num /= 10;
        }

       // System.out.println(temp); // testing temp's storage - this reverses the number, so we need a reversing method
        //this part works tho
        //System.out.println(reverse(temp));

        int reversedNumber = reverse(number);
        int reverseDigitCount = getDigitCount(reversedNumber);
        //System.out.println("Reverse digit count is: " + reverseDigitCount);

        while (reverseDigitCount < digitCount){
            //need to add zeroes onto the end of the reversed number
            reversedNumber = (reversedNumber * 10);
            reverseDigitCount = getDigitCount(reversedNumber); //make it count again
        }

        System.out.println("Reversed number is " + reversedNumber);


        //this switch statement is going to be useful later
        switch(reversedNumber){
            case 9:
                System.out.println("Nine");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 1:
                System.out.println("One");
                break;
            default:
                System.out.println("Zero");
                break;
        }
    }

    public static int reverse(int number){ //we have to reverse the above temp method because it's turning the number around
        int reverseTemp = 0; //placeholder for reversing this

        while (number > 0){
            reverseTemp = (reverseTemp * 10) + (number % 10);
            number /= 10;
        }

        return reverseTemp;
    }

    public static int getDigitCount(int number){
        int count = 0; //placeholder for counting
        while (number > 0){
            number /= 10;
            count++;
        }
        return count;
    }

}
