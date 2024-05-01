package Generics;
import java.util.*;
class student{
      
      private String name;
      private int id;

}
class Employ{
       private String name;
        private int id;



}
public class gen2 {
    public static void main(String[] args){

    
     student st1=new student();
     student st2 =new student();
     Employ e=new Employ();

      ArrayList<student> al   =new ArrayList<student>();
      al.add(st1);
      al.add(st2);
    ///  al.add(e);

    }
}
