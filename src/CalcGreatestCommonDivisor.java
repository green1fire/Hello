import java.util.Scanner;

public class CalcGreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println("Write 2 integer numbers more than 0");
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        
        int bigNumber = Math.max(firstNumber, secondNumber);
        int smallNumber = Math.min(firstNumber, secondNumber);

        int remainder = bigNumber % smallNumber;
        while (remainder != 0) {
            bigNumber = smallNumber;
            smallNumber = remainder;
            remainder = bigNumber % smallNumber;
        }
        if (smallNumber == 1) {
            System.out.println("Doesn't have a GCD");
        } else {
            System.out.printf("GCD is %d", smallNumber);
        }
    }
}
