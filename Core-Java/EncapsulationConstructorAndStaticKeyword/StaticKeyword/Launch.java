package StaticKeyword;
 
 public class Launch{
      
    static int a;

static  {
         System.out.println( "block");
         a=100;
         System.out.println(a);
      }      
  
    public  static void main(String[] args) {
        
    System.out.println("main methods");
      }
 }