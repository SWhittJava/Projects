import java.util.Scanner;

public class Tests {
    // read-only private data fields
    private int count;        // number of scores
    private double average;   // average of scores

    // Constructor
    public Tests() {
        this.count = 0;
        this.average = 0.0;
    }

    // Custom method that calculates average from user-entered test scores
    // (loops until -1 is entered)
    public void getAverage() {
        Scanner sc = new Scanner(System.in);

        double sum = 0.0;
        int localCount = 0;

        System.out.println("Enter a test score (press -1 to quit):");
        double score = sc.nextDouble();  // prime the loop

        while (score != -1) {
            sum += score;
            localCount++;
            System.out.println("Enter a test score (press -1 to quit):");
            score = sc.nextDouble();
        }

        if (localCount > 0) {
            this.average = sum / localCount;
            this.count = localCount;
        }
        // If localCount == 0, average stays at 0.0, which can lead to NaN if displayed.

        sc.close();
    }

    // Displays the results with two decimals
    public String toString() {
        return String.format("The average of the %d scores entered is %.2f",
                             this.count, this.average);
    }
}