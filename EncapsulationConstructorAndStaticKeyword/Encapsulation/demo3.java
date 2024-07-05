package Encapsulation;

class student3 {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + " " + age);
    }
}

public class demo3 {
    public static void main(String[] args) {
        student3 obj = new student3();
        student3 obj1 = new student3();
        obj.setAge(18);
        obj1.setAge(19);
        obj.setName("balvant");
        obj1.setName("ramkishan");
        int Stud1 = obj.getAge();
        System.out.println(Stud1);

        int Stud2 = obj1.getAge();
        System.out.println(Stud2);

        String StudName1 = obj.getName();
        System.out.println(StudName1);

        String StudName2 = obj1.getName();
        System.out.println(StudName2);

    }
}
