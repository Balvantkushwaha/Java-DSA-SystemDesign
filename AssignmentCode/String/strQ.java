package AssignmentCode.String;
import java.util.Scanner;
public class strQ {
        public static String removeCharAt(String str ,int pos){
        
        return str.substring(0,pos)+ str.substring(pos+1);    
    
    }
    
     public static void main(String args[]) {
        String str = "this is string";
        System.out.println(removeCharAt(str, 3));
     }
    
}

