public class Calc {
    private double num1;
    private double num2;

    // No-argument constructor
    public Calc() {
        num1 = 0;
        num2 = 0;
    }

    // Setter for num1
    public void setNum1(double n) {
        num1 = n;
    }

    // Setter for num2
    public void setNum2(double n) {
        num2 = n;
    }

    // Getter for num1 (if needed)
    public double getNum1() {
        return num1;
    }

    // Getter for num2 (if needed)
    public double getNum2() {
        return num2;
    }

    // Returns the sum of num1 and num2
    public double add() {
        return num1 + num2;
    }

    // Returns the difference (num1 minus num2)
    public double subtract() {
        return num1 - num2;
    }

    // Returns the product of num1 and num2
    public double multiply() {
        return num1 * num2;
    }

    // Returns the quotient (num1 divided by num2)
    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return Double.NaN; // or handle division by zero as desired
        }
    }

    // Optional: Override toString() to display the numbers
    @Override
    public String toString() {
        return "Num1: " + num1 + "\nNum2: " + num2;
    }
}