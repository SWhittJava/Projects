public class Pet {
    // Field for the pet's name
    private String name;

    // Constructor
    public Pet() {
        setName("Pet Name");
    }

     // Set (mutator) method
    public void setName(String newName) {
        name = newName;
    }

    // Get (accessor) method
    public String getName() {
        return name;
    }

    // Returns a string representing the pet object
    public String toString() {
        String info = "Pet information:\n";
        info += "Name: " + getName();
        return info;
    }

    public static void main(String[] args) {
        // First pet object, using the constructor
        Pet pet1 = new Pet();
        System.out.println(pet1);
        System.out.println();

        // Second pet object, naming the pet Scruffy
        Pet pet2 = new Pet();
        pet2.setName("Scruffy");
        System.out.println(pet2);
    }
}