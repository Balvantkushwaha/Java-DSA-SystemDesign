// Write a program to demonstrate method overloading with 3 different parameters 
// 3 different parameter  
class Student{
    private String collegeName = "MCBU Chhatarpur";
    private String fullName;
    private int age ;
    private int rollno;
    public Student(){
        System.out.println("Defaut Name -"+fullName);
        System.out.println("Defaut age ="+age);
        System.out.println("Defaut rollno ="+rollno);
    }
    public Student( String fullName ){
        this.fullName = fullName;
             
    }
    public Student(String fullname ,int age){
        this.fullName = fullname;
        this.age = age;

    }
    public Student(String fullname , int age , int rollNo){
        this.fullName = fullname;
        this.age = age;
        this.rollno=rollNo;

    }
    public void display(){
        System.out.println("Colleage Name -"+collegeName);
        System.out.println("Student of Full Name = "+fullName);
        System.out.println("Student of Age = "+age);
        System.out.println("Student of RollNo. = "+rollno);


    }
}
public class Q1{
    public static void main(String args[]){
       
         Student st1 = new Student();
         st1.display();
          System.out.println("--------------");
         // student 2 
         Student st2 = new Student("Hariom");
         st2.display();
          System.out.println("--------------");
         //student 3 
         Student st3 = new Student("Jasvant",18);
         st3.display();
         System.out.println("--------------");
         Student st4 = new Student("Neha",18,221220);
         st4.display();


    }
}