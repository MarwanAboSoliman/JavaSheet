import java.util.Scanner;

public class PrimeNumbersinRange {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = input.nextInt();

        System.out.print("Enter end: ");
        int end = input.nextInt();

        for (int number = start; number <= end; number++) {

            boolean prime = true;

            if (number < 2) {
                prime = false;
            }

            for (int i = 2; i < number; i++) {

                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(number + " ");
            }
        }
    }
}