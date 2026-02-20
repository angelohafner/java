import java.util.Scanner;

// Exercise 03: Even or odd
// Goal: Read an integer and tell if it is even or odd.
public class Exercise03_EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        scanner.close();
    }
}
