public class SecondMinuteChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(1237878));
        System.out.println(getDurationString(1,21));
    }

    public static String secondsError () {
        return "Check that seconds is equal or greater than 0 or minutes is greater or equal than 0";
    }

    public static String getDurationString(int seconds) {
        String stringValue;
        if(seconds >= 0) {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            stringValue = getDurationString(minutes, seconds);
        } else {
            stringValue = secondsError();
        }
        return stringValue;
    }
    public static String getDurationString(int minutes, int seconds) {
        String stringValue;
        if(minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int remainderMinutes = minutes % 60;
            int hours = minutes / 60;
            stringValue = hours + "h "
                    + remainderMinutes + "m "
                    + seconds + "s ";
        } else {
            stringValue = secondsError();
        }
        return stringValue;
    }
}
