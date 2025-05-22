// Encapsulation Example: Student class
class Student {
    // Private variables (data hiding)
    private String name;
    private int age;

    // Public getter method to access name
    public String getName() {
        return name;
    }

    // Public setter method to modify name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method to access age
    public int getAge() {
        return age;
    }

    // Public setter method to modify age
    public void setAge(int age) {
        if (age > 0) { // Adding validation
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

// Main class to test encapsulation
public class EncapsulationDemo {
    public static void main(String[] args) {
        // Creating an object of Student
        Student s = new Student();

        // Setting values using setter methods
        s.setName("Balvant");
        s.setAge(22);

        // Accessing values using getter methods
        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());
    }
}

