public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit (int number) {
        if(number < 0) {
            return -1;
        }

        int totalValue = number<=9 ? number : 0;
        int counter = 0;

        do {
            int currentNumber = number % 10;
            number = number / 10;

            totalValue += counter == 0 || number == 0 ? currentNumber : 0;
            counter++;


        } while (number > 0);

        return totalValue;
    }
}
