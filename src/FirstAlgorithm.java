public class FirstAlgorithm {
    public static void main(String[] args) {
        double value1 = 20.00;
        double value2 = 80.00;

        double result1 = (value1 + value2) * 100;
        double result2 = result1 % 40.00;

        boolean isZeroResult = result2 == 00.00;
        System.out.println(isZeroResult);

        if(!isZeroResult)
            System.out.println("got some remainder");
    }
}
