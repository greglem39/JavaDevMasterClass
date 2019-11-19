public class LastDigitChecker { //do at least 2 numbers out of 3 share the last digit?
    public static boolean hasSameLastDigit(int x, int y, int z){
        if (!isValid(x) || !isValid(y) || !isValid(z)){
            return false;
        }

        int lastX = x % 10; //extracting last digit
        int lastY = y % 10;
        int lastZ = z  % 10;

        if ((lastX == lastY) || (lastX == lastZ) || (lastZ == lastY)){  //if any two pairs are equal to one another, it's true
            return true;
        } else {
            return false;
        }


    }

    public static boolean isValid(int x){
        if (x < 10 || x > 1000) {
            return false;
        } else {
            return true;
        }
    }
}
