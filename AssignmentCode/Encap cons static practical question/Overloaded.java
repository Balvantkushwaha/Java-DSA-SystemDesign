//5. Write a program which has static block and constructor overloading , initialise variables using constructors and print it.
class Overloaded {
    private String name;
    private int age;

    // Static block
    static {
        System.out.println("Static block executed.");
    }

    // Default constructor
    public Overloaded() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Overloaded(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Calling static method without creating an object
        MessageUtility.displayMessage();

        // Creating objects using overloaded constructors
        Overloaded obj1 = new Overloaded();
        Overloaded obj2 = new Overloaded("John", 25);

        obj1.display();
        obj2.display();
    }
}
//other class 
class MessageUtility {
    public static void displayMessage() {
        System.out.println("This is a static method called without creating an object.");
    }
}
