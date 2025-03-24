import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {
        // Create two ArrayLists
        ArrayList<String> fruitList = new ArrayList<>();
        ArrayList<Integer> numberList = new ArrayList<>();

        // Add 4 items to each ArrayList
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Cherry");
        fruitList.add("Date");

        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);

        // Display the contents of each ArrayList before modifications
        System.out.println("Fruit ArrayList before modifications:");
        for (String fruit : fruitList) {
            System.out.println(fruit);
        }

        System.out.println("\nNumber ArrayList before modifications:");
        for (Integer num : numberList) {
            System.out.println(num);
        }

        // Try out 2 more operations
        // Example 1: Remove an element from fruitList
        fruitList.remove("Banana");  // removes "Banana"

        // Example 2: Insert a new element at a specific index in fruitList
        fruitList.add(1, "Blueberry");  // adds "Blueberry" at index 1

        // For the numberList, let's try two different methods:
        // Example 1: set() to modify an element
        numberList.set(0, 100); // changes the first element from 10 to 100

        // Example 2: remove() by index
        numberList.remove(2); // removes the element at index 2 (originally 30)

        // Display the contents of each ArrayList after modifications
        System.out.println("\nFruit ArrayList after modifications:");
        for (String fruit : fruitList) {
            System.out.println(fruit);
        }

        System.out.println("\nNumber ArrayList after modifications:");
        for (Integer num : numberList) {
            System.out.println(num);
        }
    }
}