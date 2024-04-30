package StaticKeyword;
class Alpha{
    static int a;
    static int b;

    int m;
    int n;

    static{
        System.out.println("static block");
        a = 10;
        b=20;

    }
    {
        System.out.println("non staic block");
        m =100;
        n=200;
        
    }
}

public class Launchalpha {
    public static void main(String[] args) {
        Alpha a1 = new Alpha();
        Alpha a2 = new Alpha();
        
    }
}
