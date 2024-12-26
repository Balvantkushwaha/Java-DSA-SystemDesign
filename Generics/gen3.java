package Generics;

import java.util.*;
class gen<T> {
   T obj;
   
   public gen( T obj){
        this.obj = obj;
   }
   void display(){
      System.out.println("type of data is :"+getClass().getName());
   }
   public T getObj(){
      return obj;
   }

}

public class gen3 {

   public static void main(String[] args) {
       gen<Integer> g = new gen<Integer>(10);
       g.display();
       System.out.println(g.getObj());

       System.out.println("==================");

       gen<String> g1 = new gen<String>("pw skill");
       g1.display();
       System.out.println(g1.getObj());


   //    ArrayList<gen> list1 = new ArrayList<gen>();
   //    List<String> list2 = new ArrayList<String>();
   //    Collection<Integer> list3 = new ArrayList<Integer>();
   //         // object not allow 
   //    //List<object> list4  = new ArrayList<String>();
   //   List<Integer> list5 = new ArrayList<Integer>();
      
   //         // primitive data not allow 
   //  // List<int> list6 = new ArrayList<int>();
   }
}
