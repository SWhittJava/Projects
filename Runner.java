public class Runner {
    public static void main(String[] args) {
        // Instantiate an object of class Tests
        Tests testsObj = new Tests();

        // Let the user type in test scores
        testsObj.getAverage();

        // Display the number of scores and the average (2 decimals)
        System.out.println(testsObj);
    }
}