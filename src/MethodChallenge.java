public class MethodChallenge {
    public static void main(String[] args) {
        int playerScore;
        playerScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", playerScore);

        playerScore = calculateHighScorePosition(999);
        displayHighScorePosition("Andrés", playerScore);

        playerScore = calculateHighScorePosition(500);
        displayHighScorePosition("Lauren", playerScore);

        playerScore = calculateHighScorePosition(100);
        displayHighScorePosition("Jack", playerScore);

        playerScore = calculateHighScorePosition(25);
        displayHighScorePosition("Sophie", playerScore);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position "
                + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int finalScore;
        if(playerScore >= 1000) {
            finalScore = 1;
        } else if(playerScore >= 500 && playerScore < 1000) {
            finalScore = 2;
        } else if(playerScore >= 100 && playerScore < 500) {
            finalScore = 3;
        } else {
            finalScore = 4;
        }

        return finalScore;
    }
}
