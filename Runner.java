public class Runner {
    public static void main(String[] args) {
        // Instantiate an object of class Tests using the constructor.
        Tests testsObj = new Tests();

        // Let the user type in test scores and calculate the average.
        testsObj.getAverage();

        // Display the number of scores and the average (formatted to 2 decimals).
        System.out.println(testsObj);
    }
}