package StaticKeyword;
class demo2{
    static void disp1(){
        System.out.println("static metos disp1");
    }
    void disp2(){
        System.out.println("static metos disp2");
    }
}
public class methos{
    public static void main(String[] args) {
        demo2.disp1();
       // demo2.disp2();
       demo2 d = new demo2();
       d.disp2();
       d.disp1();
    }
}