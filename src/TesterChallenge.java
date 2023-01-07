public class TesterChallenge {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying (boolean summer, int temperature) {
        boolean isPlaying;
        if(summer && temperature >= 25 && temperature <= 45) {
            isPlaying = true;
        } else if (!summer && temperature >= 25 && temperature <= 35) {
            isPlaying = true;
        } else {
            isPlaying = false;
        }

        return isPlaying;
    }
}
