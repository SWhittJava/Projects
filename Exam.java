/**
 * Exam.java
 *
 * Represents an exam that extends Assessment.
 * This version includes exam-specific details such as the number
 * of questions and the points assigned to each question.
 */
public class Exam extends Assessment {

    // Exam-specific fields
    private int numQuestions;
    private int pointsEach;

    /**
     * Default constructor.
     */
    public Exam() {
        super();  // Calls Assessment's default constructor.
    }

    /**
     * Constructs an Exam with the specified number of questions
     * and points per question.
     *
     * @param numQuestions the number of questions on the exam
     * @param pointsEach   the number of points each question is worth
     */
    public Exam(int numQuestions, int pointsEach) {
        super();  // Calls Assessment's default constructor.
        this.numQuestions = numQuestions;
        this.pointsEach = pointsEach;
    }

    /**
     * Returns the number of points each question is worth.
     *
     * @return the points per question
     */
    public int getPointsEach() {
        return pointsEach;
    }
    
    /**
     * Optionally, returns the number of questions on the exam.
     *
     * @return the number of questions
     */
    public int getNumQuestions() {
        return numQuestions;
    }
    
    /**
     * Optionally, calculates the total score possible for the exam.
     *
     * @return the total score (number of questions multiplied by points each)
     */
    public int getTotalScore() {
        return numQuestions * pointsEach;
    }
    
    @Override
    public String toString() {
        // Assuming Assessment.toString() provides basic details from the superclass.
        return super.toString() 
                + " Exam: " + numQuestions + " questions, " 
                + pointsEach + " points each (Total: " + getTotalScore() + " points)";
    }

    /**
     * Main method for testing the Exam class independently.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // For example, an exam with 50 questions where each question is worth 2 points.
        Exam exam = new Exam(50, 2);
        System.out.println(exam);
        System.out.println("Points Each: " + exam.getPointsEach());
    }
}