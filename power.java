public class Main {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}