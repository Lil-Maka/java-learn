public class SumOdd {
    public static void main (String [] args) {
        System.out.println(sumOdd(0, 6));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public static int sumOdd (int start, int end) {
        int totalSumOdd = 0;
        if(start > end || start < 0) {
            return -1;
        }
        for(int i = start; i <= end; i++) {
            boolean isCurrentNumberOdd = isOdd(i);
            totalSumOdd += isCurrentNumberOdd ? i : 0;
        }
        return totalSumOdd;
    }
}
