public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-5));
    }

    public static int sumDigits(int number) {
        if(number < 0) return -1;

        String numberString = Integer.toString(number);
        int totalSum = 0;
        for(int i = 0; i < numberString.length(); i++) {
            char singleCharNumber = numberString.charAt(i);
            int singleNumber = Integer.parseInt(String.valueOf(singleCharNumber));
            totalSum += singleNumber;
        }
        return totalSum;
    }
}
