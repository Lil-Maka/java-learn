public class SharedDigit {
    public static void main (String [] args)  {
        System.out.println(hasSharedDigit(12, 13));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit (int val1, int val2) {
        boolean isShareDigit = false;
        int singleDigit1 = val1;
        int singleDigit2 = val2;

        if(val1 < 10 || val1 > 99 || val2 < 10 || val2 > 99) {
            return false;
        } else {
            while(singleDigit1 > 0) {
                int currentValue1 = singleDigit1 % 10;
                singleDigit1 /= 10;

                while (singleDigit2 > 0) {
                    int currentValue2 = singleDigit2 % 10;
                    singleDigit2 /= 10;

                    if(currentValue2 == currentValue1) {
                        isShareDigit = true;
                        break;
                    }
                }

                singleDigit2 = val2;
                if(isShareDigit) break;
            }
        }

        return isShareDigit;
    }
}
