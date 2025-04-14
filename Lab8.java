import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lab8 {

    public static void main(String[] args) {
        String inputFile = "pay.csv";  // Update path if necessary

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            
            // Read and discard the header line (EmpID,PayRate,HoursWorked).
            String header = br.readLine();

            String line;
            while ((line = br.readLine()) != null) {
                // Split on commas
                String[] data = line.split(",");

                // Make sure we have exactly 3 columns: EmpID, PayRate, HoursWorked
                if (data.length == 3) {
                    String empId = data[0].trim(); // e.g. "101"
                    
                    // Parse pay rate and hours worked as doubles
                    double payRate = Double.parseDouble(data[1].trim());
                    double hoursWorked = Double.parseDouble(data[2].trim());

                    // Calculate weekly pay (time-and-a-half for hours over 40)
                    double weeklyPay;
                    if (hoursWorked > 40) {
                        double overtimeHours = hoursWorked - 40;
                        // Normal pay for 40 hours + 1.5x pay for overtime
                        weeklyPay = (40 * payRate) + (overtimeHours * payRate * 1.5);
                    } else {
                        weeklyPay = hoursWorked * payRate;
                    }

                    // Output the result, formatted to two decimal places
                    System.out.printf("EmpID: %s, Weekly Pay: $%.2f%n", empId, weeklyPay);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error converting string to a number: " + e.getMessage());
        }
    }
}