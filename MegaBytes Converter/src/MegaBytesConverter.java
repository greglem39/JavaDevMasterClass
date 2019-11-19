public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            //the only reason this should matter is if kiloBytes are >= 0. Thus why I didn't define it before the if-else
            int megaBytes = kiloBytes / 1024;
            int remainingKB = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKB + " KB");
        }
    }
}
