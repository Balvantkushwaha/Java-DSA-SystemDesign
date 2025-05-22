import java.io.*;
import java.util.*;

public class hackerday18 {
     static Stack<Character> stack = new Stack<>();
     static Queue<Character> queue = new LinkedList<>();

     public void pushCharacter(char ch){
         stack.push(ch);
     }
     public void enqueueCharacter(char ch){
        queue.add(ch);
     }
     public char popCharacter(){
        return stack.pop();
     }
     public char dequeueCharacter(){
         return queue.remove();
     }
     
     
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       String s = str.toLowerCase();
       hackerday18 obj = new hackerday18();

       //push character 
       for(char ch :s.toCharArray()){
         obj.pushCharacter(ch);
         obj.enqueueCharacter(ch);
       }
       boolean isPalindron = true;
       if(obj.popCharacter()!=obj.dequeueCharacter()){
           isPalindron= false;
           
       }
    
       
       if(isPalindron){
           System.out.print("The word,"+s+", is a palindrome."); 
       }
       else{
        System.out.print("The word,"+s+", is not a palindrome.");
       }     
    }
}