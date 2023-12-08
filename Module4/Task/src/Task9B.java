import java.util.Scanner;

public class Task9B {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your Automation School name");
            String text = userInput.nextLine();

            if (text.equalsIgnoreCase("Testify")) {
                System.out.println("Thank You");
                break;
            } else {
                System.out.println("Try Again");
            }
        }

        // Close the Scanner
        userInput.close();
    }
}
