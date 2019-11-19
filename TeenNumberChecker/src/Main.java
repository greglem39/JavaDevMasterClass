public class Main {
    public static void main(String[] args) {

        System.out.println("testing isTeen");
        boolean result = TeenNumberChecker.isTeen(14);
        System.out.println(result);
        result = TeenNumberChecker.isTeen(9);
        System.out.println(result);
        result = TeenNumberChecker.isTeen(19);
        System.out.println(result);
        result = TeenNumberChecker.isTeen(24);
        System.out.println(result);
        result = TeenNumberChecker.isTeen(12);
        System.out.println(result);
        result = TeenNumberChecker.isTeen(18);
        System.out.println(result);

        System.out.println("\ntesting hasTeen");

        boolean result2 = TeenNumberChecker.hasTeen(12, 28, 14);
        System.out.println(result2);
        result2 = TeenNumberChecker.hasTeen(12, 28, 89);
        System.out.println(result2);
    }
}
