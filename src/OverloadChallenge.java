public class OverloadChallenge {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = " +
                convertToCentimeters(8, 5) + "cm");

        System.out.println("68in = " +
                convertToCentimeters(68) + "cm");
    }

    public static double convertToCentimeters(int inchHeight) {
        return inchHeight * 2.54;
    }

    public static double convertToCentimeters(int inchHeight, int feetHeight) {
        int feetToInch = feetHeight * 12;

        return convertToCentimeters(inchHeight + feetToInch);
    }
}
