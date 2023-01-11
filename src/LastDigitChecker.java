public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean isValid (int value) {
        return (value >= 10 && value <= 1000);
    }

    public static boolean hasSameLastDigit (int value1, int value2, int value3) {
        boolean isSameLastDigit = false;

        if(!isValid(value1) || !isValid(value2) || !isValid(value3)) isSameLastDigit = false;
        else {
            int modValue1 = value1%10;
            int modValue2 = value2%10;
            int modValue3 = value3%10;

            if(modValue1 == modValue2 || modValue1 == modValue3 | modValue2 == modValue3) isSameLastDigit = true;
        }

        return isSameLastDigit;
    }
}
