package Generics;
import java.util.*;
public class gen1{
    public static void main(String[] args)
       { 
         //typesafety
          String ar[]=new String[10];
                 ar[0]="balvant youtag";
                 ar[1]= " pw skill";
                 //ar[2]=10;
                 System.out.println(ar[0]);
                 // String name1 =ar[0];
                 // String name2=ar[1];
         String name1 = ar[0];
         String name2=  ar[1];
         // type casting achive using generics
         ArrayList<String> al = new ArrayList<String>(10);
            al.add("Balvant");
            al.add("pw");
            //al.add(10);
          // String n1= (String)al.get(0);
          // String n2 = (String)al.get(1);
          // String n3= (String)al.get(2);
         
      }
}