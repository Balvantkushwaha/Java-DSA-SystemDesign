import java.util.HashMap;
import java.util.Scanner;


public class firstOccurence {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the String :");
         String str = sc.nextLine();
         HashMap<Character ,Integer> map = new HashMap<>();
         // Construction of a Hashtable 
         // key -unique characters in the string 
         // value - frequencey of each character in the string 
           

         for(int i=0;i<str.length();i++){ 
            
            if(map.containsKey(str.charAt(i))){
                 map.put(str.charAt(i),map.get(str.charAt(i))+1);
             }
             else{
                 map.put(str.charAt(i),1);
             }
            
         }
         // scan the entire hashtable and get the index of the non- repeating charactor
         int result =-1;
        System.out.println(map);
         for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                System.out.println("the first non- repeating character index is :"+i);
                result =1 ;
                break;
            }
         }
         if(result ==-1){
            System.out.println("Non non-repeating character present int the string");
         }
   }
}
