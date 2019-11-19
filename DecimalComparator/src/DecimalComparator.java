public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        if ((int)(num1 * 1000) == (int)(num2 * 1000)){ //we need to cast this as an int or the boolean will keep going
            return true;
        } else{
            return false;
        }
    }
}
