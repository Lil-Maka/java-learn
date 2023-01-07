public class TesterChallenge {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    public static double area (double radius) {
        double radiusValue = -1.0;
        if(radius >= 0) {
            radiusValue = Math.PI * Math.pow(radius, 2);
        }
        return radiusValue;
    }

    public static double area (double x, double y) {
        double radiusValue = -1.0;
        if(x >= 0 && y >= 0) {
            radiusValue = x * y;
        }
        return radiusValue;
    }
}
