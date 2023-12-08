import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        try (Scanner slackChannel = new Scanner(System.in)) {
            Task10 taskInstance = new Task10();

            while (true) {
                String text = taskInstance.getUserInput(slackChannel);
                taskInstance.verifyUsersTraining(text);
                if (text.equalsIgnoreCase("Testify")) {
                    break;
                }
            }
        }
    }

    private String getUserInput(Scanner scanner) {
        System.out.println("What training did you sign up for?");
        return scanner.nextLine();
    }

    public void verifyUsersTraining(String userInput) {
        if (userInput.equalsIgnoreCase("Testify")) {
            System.out.println("You are welcome to the Testify family");
        } else {
            System.out.println("Sorry! Channel not allowed");
        }
    }
}
