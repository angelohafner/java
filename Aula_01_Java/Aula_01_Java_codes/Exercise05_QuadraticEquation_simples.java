import java.util.Scanner;

public class Exercise05_QuadraticEquation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read coefficients
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Check if a is zero
        if (a == 0) {
            System.out.println("This is not a quadratic equation.");
            scanner.close();
            return;
        }

        // Calculate discriminant
        double discriminant = b * b - 4 * a * c;

        // Evaluate roots
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Two real roots:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        } else if (discriminant == 0) {
            double x = -b / (2 * a);

            System.out.println("One real root:");
            System.out.println("x = " + x);

        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);

            System.out.println("Two complex roots:");
            System.out.println("x1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("x2 = " + realPart + " - " + imaginaryPart + "i");
        }

        scanner.close();
    }
}
