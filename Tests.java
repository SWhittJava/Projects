import java.util.Scanner;

public class Tests {
    // Private data fields (some are read-only)
    private double ave;  // average of scores (read-only)
    private int count;   // number of scores entered (read-only)
    private int score;   // a single test score

    // Constructor
    public Tests() {
        this.ave = 0.0;
        this.count = 0;
        this.score = 0;
    }

    // Read-only: returns the current average of all scores
    public double getAve() {
        return this.ave;
    }

    // Read-only: returns how many scores have been entered
    public int getCount() {
        return this.count;
    }

    // Read/write: gets a single score
    public int getScore() {
        return this.score;
    }

    // Read/write: sets a single score
    public void setScore(int newScore) {
        this.score = newScore;
    }

    /**
     * Prompts the user for test scores (until -1 is entered), 
     * calculates the average, and updates the 'ave' and 'count' fields.
     */
    public void getAverage() {
        Scanner sc = new Scanner(System.in);

        double sum = 0.0;
        int localCount = 0;

        System.out.println("Enter a test score (enter -1 to quit):");
        double inputScore = sc.nextDouble(); // prime the loop

        while (inputScore != -1) {
            sum += inputScore;
            localCount++;

            System.out.println("Enter a test score (enter -1 to quit):");
            inputScore = sc.nextDouble();
        }

        // Only calculate if at least one score was entered
        if (localCount > 0) {
            this.ave = sum / localCount;
            this.count = localCount;
        }

        sc.close();
    }

    /**
     * Returns a string that displays the number of test scores entered 
     * and the average (formatted to 2 decimals).
     */
    @Override
    public String toString() {
        return String.format(
            "The average of the %d scores entered is %.2f",
            this.count, this.ave
        );
    }
}