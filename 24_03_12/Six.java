import java.util.*;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        try {
            int result = dividend / divisor;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occurred");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
