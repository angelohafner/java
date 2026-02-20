import java.util.Scanner;

// Exercise 05: Average of three numbers
// Goal: Read three doubles and print the arithmetic average.
public class Exercise05_AverageOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double y = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double z = scanner.nextDouble();

        double average = (x + y + z) / 3.0;

        System.out.println("Average = " + average);

        scanner.close();
    }
}
