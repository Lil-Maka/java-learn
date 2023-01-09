public class TesterChallenge {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(int year) {
        if(year > 0 && year < 10000) {
            return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if(month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            default:
                if(month == 2) {
                    boolean isLeapMonth = isLeapYear(year);
                    return isLeapMonth ? 29 : 28;
                }
                else return 30;
        }
    }
}
