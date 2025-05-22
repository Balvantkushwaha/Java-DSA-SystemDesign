//4.write a program to call a method without creating an object of a class .
class withoutObject {
    private String name;
    private int age;

    public withoutObject() {
        // Default constructor
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void displayMessage() {
        System.out.println("This is a withoutObject method called without creating an object.");
    }

    public static void main(String[] args) {
        // Calling withoutObject method without creating an object
        withoutObject.displayMessage();
    }
}

