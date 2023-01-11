public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(707));
    }

    public static boolean isPalindrome (int number) {
        int reverseNumber = 0;
        int initialNumber = number;
        while (initialNumber != 0) {
            int position = initialNumber % 10;
            initialNumber = initialNumber/10;

            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + position;
        }
        return reverseNumber == number;
    }
}
