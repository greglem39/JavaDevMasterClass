public class BarkingDog {
    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if (barking) {
            if ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay <= 23)) {
                // if it's between midnight and 8AM or 10 and 11PM and the dog is barking...
                return true;
            }
        }
        //if not, we're not waking
        return false;
    }
}
