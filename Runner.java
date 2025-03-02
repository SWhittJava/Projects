import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first number with safe input
        double num1 = getValidDouble(scanner, "Enter first number: ");

        // Get the second number with safe input
        double num2 = getValidDouble(scanner, "Enter second number: ");

        // Continue with the rest of your program (e.g., use Calc methods)
        System.out.println("You entered: " + num1 + " and " + num2);

        // Example call if Calc.java provides an add method:
        // double sum = Calc.add(num1, num2);
        // System.out.println("The sum is: " + sum);
    }

    /**
     * Continuously prompts the user until a valid double is entered.
     *
     * @param scanner the Scanner object to read input
     * @param prompt  the message to prompt the user
     * @return a valid double entered by the user
     */
    private static double getValidDouble(Scanner scanner, String prompt) {
        double value = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                valid = true;
            } else {
                // Consume the invalid input so we can try again
                String invalid = scanner.next();
                System.out.println("Invalid input '" + invalid + "'. Please enter a valid number.");
            }
        }
        return value;
    }
}