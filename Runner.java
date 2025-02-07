import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        // First Pet object (default constructor)
        Pet p1 = new Pet();
        System.out.println(p1);
        System.out.println();

        // Second Pet object (custom constructor)
        Pet p2 = new Pet("Buster", "Dog", 11);
        System.out.println(p2);
        System.out.println();

        // Third Pet object (user input for type, name, age)
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter animal type:");
        String userType = sc.nextLine();

        System.out.println("Enter animal name:");
        String userName = sc.nextLine();

        System.out.println("Enter animal age:");
        int userAge = sc.nextInt();

        // Use the custom constructor
        Pet p3 = new Pet(userName, userType, userAge);

        System.out.println();
        System.out.println(p3);

        sc.close();
    }
}