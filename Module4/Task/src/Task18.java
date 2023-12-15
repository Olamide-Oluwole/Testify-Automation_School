import java.util.InputMismatchException;
import java.util.Scanner;

public class Task18 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
//asks the user for age and that accepts the Integer value
            try {
                System.out.print("Enter your age: ");
                int age = scanner.nextInt();

                // Use the age entered for further processing
                System.out.println("You entered: " + age);
                //Handle the error that is encountered when the users tries to enter a name instead of age
            } catch (InputMismatchException e) {
                // Handle the case when the user enters a non-integer value
                System.out.println("Invalid input. Please enter a valid integer for age.");
            } finally {
                // Close the scanner to prevent resource leak
                scanner.close();
            }
        }
    }
