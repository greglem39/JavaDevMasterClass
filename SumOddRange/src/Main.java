//let's add up all the odd numbers found in a defined start/end range

public class Main {
    public static void main(String[] args) {
        int result = SumOddRange.sumOdd(7, 9);
        System.out.println("The result is " + result);
        result = SumOddRange.sumOdd(3, 12);
        System.out.println("The result is " + result);
        result = SumOddRange.sumOdd(1000000009, 73);//testing an error case
        System.out.println("The result is " + result);
        result = SumOddRange.sumOdd(-7, 9);//testing an error case
        System.out.println("The result is " + result);
    }
}
