package StaticKeyword;
import java.util.Scanner;
 
class Farmmer{
    int pa;
    float td;
    static float ri;
    float si;
       static {
        ri =3.0f;
       }
     void input() {
       Scanner scan = new Scanner(System.in);
       System.out.println("please enter the amout requied");
       pa= scan.nextInt();
       System.out.println("plese enter the time duration  year ");
       td = scan.nextFloat();
      

     }
      void compute(){
        si = (pa*td*ri)/100f;
      }

      void disp(){
        System.out.println("Si is ="+ si);
      }


}

public class Farmerlaunch {
 public static void main(String[] args) {
        
 
    Farmmer f1 = new  Farmmer();
    Farmmer f2 = new  Farmmer();
    f1.input();
    f1.compute();
    f1.disp();

   }
    
}
