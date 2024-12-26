package Generics;

class Student{
    private String name ;
    private int age ;
    private String city;

public Student(String name , int age , String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }
public String toString(){
        return "name :"+name+"|age:"+age+"|city:"+city;
    }
}
public class LaunchIntroIo {
    public static void main(String[] args) {
        Student st = new Student("balvant", 20, "chhatarpur");
        System.out.println(st);
        Student st1 = new Student("hariom", 19, "chhatarpur");
        System.out.println(st1);
        // jvm shut down 
    }
}
