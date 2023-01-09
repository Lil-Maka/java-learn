public class WhileAlgorithm {
    public static void main(String[] args) {
        int number = 5;
        int totalEvenNumber = 0;
        int totalOddNumber = 0;
        while(number <= 20) {
            boolean isEven = isEvenNumber(number);
            if(isEven) {
                totalEvenNumber++;
                System.out.println(number);
            } else {
                totalOddNumber++;
            }
            number++;

        }
        System.out.println("Total founded even numbers is: " + totalEvenNumber);
        System.out.println("Total founded odd numbers is: " + totalOddNumber);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

}
