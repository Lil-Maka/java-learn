public class SumEvenInDigit {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        int totalEvenInDigitSum = 0;

        if(number < 0) {
            return -1;
        }

        while (number > 0) {
            int currentValue = number%10;
            number /= 10;

            totalEvenInDigitSum += currentValue % 2 == 0 ? currentValue : 0;
        }

        return totalEvenInDigitSum;
    }
}
