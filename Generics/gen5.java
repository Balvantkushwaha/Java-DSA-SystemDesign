package Generics;

class Student {
    int marks;
    int age;
    String name;

    // constructor
    Student(int marks, int age, String name) {
        this.marks = marks;
        this.age = age;
        this.name = name;
    }

    // value passing getter & setter
    // public int getMarks() {
    // return marks;
    // }

    // public int getAge() {
    // return age;
    // }

    // public String getName() {
    // return name;
    // }

    // public String toString() {
    // return "" + marks + "-" + age + "-" + name;
    // }

}

public class gen5 {
    public static void main(String[] args) {
        Student st1 = new Student(99, 18, "Hariom");
        Student st2 = new Student(90, 19, "balvant");
        Student st3 = new Student(70, 16, "Raju");
        System.out.println(st1);

    }
}
