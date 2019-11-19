//let's find out if our dog barking wakes us up!

public class Main {

    public static void main(String[] args) {


        boolean wakeUp = BarkingDog.shouldWakeUp(true, 5);
        System.out.println(wakeUp);
        wakeUp = BarkingDog.shouldWakeUp(false, 5);
        System.out.println(wakeUp);


    }
}
