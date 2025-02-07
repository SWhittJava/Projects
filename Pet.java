public class Pet {
    private int age;
    private String name;
    private String type;

    // Default Constructor
    public Pet() {
        setName("Pet Name");
        setType("Animal");
        setAge(1);
    }

    // Custom Constructor with three parameters
    public Pet(String newName, String newType, int newAge) {
        setName(newName);
        setType(newType);
        setAge(newAge);
    }

    // Accessors
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    // Mutators
    public void setAge(int newAge) {
        age = newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setType(String newType) {
        type = newType;
    }

    // Custom method: speak()
    public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof";
        } else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        } else {
            return "Noise";
        }
    }

    // toString method
    public String toString() {
        String info = "Pet information:\n";
        info += "Type: " + getType() + "\n";
        info += "Name: " + getName() + "\n";
        info += "Sound: " + speak() + "\n";
        info += "Age:  " + getAge();
        return info;
    }
}