// 2.write a program and create a constructor with parameters and initialise the variable using a constructor.
class constructor {
    private String name;
    private int age;

    public constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        constructor obj1 = new constructor("John", 25);
        obj1.display();
    }
}