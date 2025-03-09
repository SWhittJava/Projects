import java.util.Arrays;
import java.util.Random;

public class IntArray {
    // Private data fields
    private int length;
    private int[] myArray;

    // Constructor: creates an array of the given length
    public IntArray(int l) {
        this.length = l;
        this.myArray = new int[l];
    }

    // Sets every element of the array to 0
    public void clear() {
        for (int i = 0; i < length; i++) {
            myArray[i] = 0;
        }
    }

    // Fills the array with random integers between 1 and 6
    public void fillRand() {
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            // nextInt(6) produces 0-5; adding 1 makes it 1-6
            myArray[i] = rand.nextInt(6) + 1;
        }
    }

    // Returns the element at the specified index
    public int get(int element) {
        if (element >= 0 && element < length) {
            return myArray[element];
        } else {
            throw new IndexOutOfBoundsException("Index " + element + " is out of bounds.");
        }
    }

    // Sets the element at the specified index to the new value
    public void set(int element, int newValue) {
        if (element >= 0 && element < length) {
            myArray[element] = newValue;
        } else {
            throw new IndexOutOfBoundsException("Index " + element + " is out of bounds.");
        }
    }

    // Returns the size (length) of the array
    public int size() {
        return length;
    }

    // Returns true if the array is empty (i.e., has zero length)
    public boolean isEmpty() {
        return length == 0;
    }

    // Sorts the array using Java's built-in sorting algorithm
    public void sort() {
        Arrays.sort(myArray);
    }

    // Overrides Object.toString() to return a human-readable representation of the array
    @Override
    public String toString() {
        return Arrays.toString(myArray);
    }
}