import java.util.Scanner;

// Exercise 04: Multiplication table
// Goal: Read an integer and print its multiplication table from 1 to 10.
public class Exercise04_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);8

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        System.out.println("Multiplication table for " + n + ":");
        for (int i = 1; i <= 10; i = i + 1) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }

        scanner.close();
    }
}
