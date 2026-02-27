import java.util.Scanner;

// Exercise 02: Sum of two numbers
// Goal: Read two integers and print their sum.
public class Exercise02_SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.println("Sum = " + sum);

        scanner.close();
    }
}
