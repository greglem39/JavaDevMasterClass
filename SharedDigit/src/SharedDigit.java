public class SharedDigit { //check if two numbers between 10 and 99 share at least one digit
    public static boolean hasSharedDigit(int x, int y){
        if (x < 10 || x > 99 || y < 10 || y > 99){
            return false;
        } else {
            int a1 = x % 10;
            int a2 = x / 10;
            int b1 = y % 10;
            int b2 = y /10;

            if (a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2){
                return true;
            }
        }
        return false;
    }
}
