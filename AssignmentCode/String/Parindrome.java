package AssignmentCode.String;

import java.util.Scanner;

public class Parindrome {
     public static boolean isParindrome(String str){
        str = str.toLowerCase();
        String revstr ="";
        for(int i = str.length()-1;i>=0;i--){
            revstr = revstr +str.charAt(i);
        } 
        return str.equals(revstr) ;
     }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the String for check Parindrome String yes or not");
         String str = sc.nextLine();
         boolean result = isParindrome(str);
         if(result){
            System.out.println("String is a Parindrome ");
         }
         else{
            System.out.println("String is not a parindrome");
         }

    }
}