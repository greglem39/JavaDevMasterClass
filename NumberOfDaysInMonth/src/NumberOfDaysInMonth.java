public class NumberOfDaysInMonth {

    public static boolean isLeapYear( int year){
        if (year < 1 || year > 9999 ){
            System.out.println( "Invalid Request");
            return false;
        } else {
            if ((year%4) == 0){
                if ((year%100) == 0){
                    if((year%400) == 0){
                        System.out.println("Year is leap year");
                        return true;
                    }
                    else{
                        System.out.println("Year is not leap year");
                        return false;
                    }
                }
                else {
                    System.out.println("Year is leap year");
                    return true;
                }
            }
            else{
                System.out.println("year is not leap year");
                return false;
            }
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }

        switch(month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }
    }
}
