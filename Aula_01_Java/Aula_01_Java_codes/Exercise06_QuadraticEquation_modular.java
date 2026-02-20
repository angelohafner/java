import java.util.Locale;
import java.util.Scanner;

public class Exercise06_QuadraticEquation {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Ensure dot as decimal separator
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        solveQuadratic(a, b, c);

        scanner.close();
    }

    // Function that calculates and prints the roots
    public static void solveQuadratic(double a, double b, double c) {

        if (a == 0) {
            System.out.println("Not a quadratic equation.");
            return;
        }

        double delta = calculateDiscriminant(a, b, c);

        if (delta > 0) {
            double x1 = calculateRoot1(a, b, delta);
            double x2 = calculateRoot2(a, b, delta);

            System.out.println("Two real roots:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        } else if (delta == 0) {
            double x = calculateSingleRoot(a, b);

            System.out.println("One real root:");
            System.out.println("x = " + x);

        } else {
            printComplexRoots(a, b, delta);
        }
    }

    // Function to calculate discriminant
    public static double calculateDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    // Function to calculate first root
    public static double calculateRoot1(double a, double b, double delta) {
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    // Function to calculate second root
    public static double calculateRoot2(double a, double b, double delta) {
        return (-b - Math.sqrt(delta)) / (2 * a);
    }

    // Function for double root
    public static double calculateSingleRoot(double a, double b) {
        return -b / (2 * a);
    }

    // Function to print complex roots
    public static void printComplexRoots(double a, double b, double delta) {

        double realPart = -b / (2 * a);
        double imaginaryPart = Math.sqrt(-delta) / (2 * a);

        System.out.println("Two complex roots:");
        System.out.println("x1 = " + realPart + " + " + imaginaryPart + "i");
        System.out.println("x2 = " + realPart + " - " + imaginaryPart + "i");
    }
}
