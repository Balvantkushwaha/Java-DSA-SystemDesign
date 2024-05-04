package EncapsulationConstructorAndStaticKeyword.constructor;

class student3 {
    private String name;
    private int age;

    public student3() {
        name = "Balvant";
        age = 18;
    }

    public student3(String name) {
        this.name = name;
        age = 19;
    }

    public student3(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void disp() {
        System.out.println(name);
        System.out.println(age);
    }

}

public class Launch3 {
    public static void main(String[] args) {
        student3 std1 = new student3();
        std1.disp();

        student3 std2 = new student3("Balvant kushwaha");
        std2.disp();

        student3 std3 = new student3("balvant kushwaha ", 20);
        std3.disp();

    }

}
