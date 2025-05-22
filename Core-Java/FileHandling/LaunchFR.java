package FileHandling;
import java.io.*;
public class LaunchFR {
   public static void main(String[] args) throws Exception {
     File dir  = new File("pw");
     File file = new File(dir,"pw.txt");
     FileReader fd = new FileReader(file);
     int i = fd.read();
    // System.out.println((char)i);
     
      
     while ( i!=-1) {
        System.out.print(i+"---->");
        System.out.println((char)i);
        i= fd.read();        
     }
     
      
   } 
}
