public class AllFactors {
    public static void main(String[] args) {
        printFactors(700);
    }

    public static void printFactors(int number) {
        if(number < 1) System.out.println("Invalid Value");
        else {
            for(int i = 1; i <= number; i++) {
                boolean isFactor = number % i == 0;
                if(isFactor) System.out.println(i);
            }
        }
    }
}
