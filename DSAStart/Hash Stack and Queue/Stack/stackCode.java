package Stack;
import java.util.*;
public class stackCode{
     public static void main(String[] args) {
         Stack<Integer> stack1 = new Stack<>();
         // push the element inside the stack
         stack1.push(2);
         stack1.push(4);
         stack1.push(6);
         stack1.push(9);
         // print the top most element in the stack 
         System.out.println("The tomost element in the before deletion is:"+stack1.peek());

         // delete the top element in the stack 
         stack1.pop();
         // print the topmost element in the stack 
         System.out.println("the tomost element in the after deletion is :"+stack1.peek());

         // search an element in the stack 
         // search function return -1 when the element is not present in the stack 
         System.out.println("Element 1 is present at the position:"+stack1.search(2));

         // check whether the stack is empty or not 
         // empty function return the boolean value (true/ false)
         System.out.println("Is stack empty or not"+ stack1.empty());

         
     }
}