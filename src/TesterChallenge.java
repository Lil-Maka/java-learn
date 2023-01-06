public class TesterChallenge {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen  (int firstAge, int secondAge, int thirdAge) {
        boolean isFirstAgeTeen = isTeen(firstAge);
        boolean isSecondAgeTeen = isTeen(secondAge);
        boolean isThirdAgeTeen = isTeen(thirdAge);

        return isFirstAgeTeen || isSecondAgeTeen || isThirdAgeTeen;
    }

    public static  boolean isTeen (int age) {
        return age >= 13 && age <= 19;
    }
}
