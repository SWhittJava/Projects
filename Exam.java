import javax.swing.JOptionPane;

public class Exam {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        
        // Get the first number with exception handling for invalid input
        try {
            String input1 = JOptionPane.showInputDialog("Enter the first number:");
            num1 = Integer.parseInt(input1);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input for the first number. Please enter a valid integer.");
            System.exit(0);  // Exit the program if input is invalid
        }
        
        // Get the second number with exception handling for invalid input
        try {
            String input2 = JOptionPane.showInputDialog("Enter the second number:");
            num2 = Integer.parseInt(input2);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input for the second number. Please enter a valid integer.");
            System.exit(0);  // Exit the program if input is invalid
        }
        
        // Now, perform the division, and handle division by zero
        try {
            int result = num1 / num2;
            JOptionPane.showMessageDialog(null, "The result of " + num1 + " / " + num2 + " is " + result);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Division by zero error. Please run the program again with a non-zero divisor.");
        }
    }
}