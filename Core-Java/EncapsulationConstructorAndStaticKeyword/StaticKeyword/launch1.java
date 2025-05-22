package StaticKeyword;
 class demo1 {
     static int a;
     static String b;
    
      int m;
      String n;

      static {
         System.out.println("controle is static block ");
         a =20;
         b= "balvant";

      }

      {
        System.out.println("controle is non static block");
         m=100;
         n= "kushwaha";
         
      }
      static void disp1() {
        System.out.println("value of static var is a="+a);
        System.out.println("value of static var is b="+b);



      }
      void disp2() {
        System.out.println("value of non static var is m ="+m);
        System.out.println("value of non static var is n="+n);



      }

    }
    

public class launch1{
 public static void main(String[] args) {
     
      demo1 d = new demo1();
      demo1.disp1();
      d.disp2();
         
  
 }
}

