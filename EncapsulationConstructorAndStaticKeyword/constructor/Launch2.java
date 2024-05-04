package EncapsulationConstructorAndStaticKeyword.constructor;

class student1 {
    private String name;
    private int rollno;
    private String classname;

    student1(String name, int rollno, String classname) {
        this.name = name;
        this.rollno = rollno;
        this.classname = classname;

    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;

    }

    public String getClassname() {
        return classname;
    }

}

public class Launch2 {
    public static void main(String[] args) {
        student1 std = new student1("Balvant", 22105077, "Bsc 2nd year");
        System.out.println("Name:" + std.getName());
        System.out.println("Roll no.:" + std.getRollno());
        System.out.println("Name:" + std.getClassname());

    }

}
