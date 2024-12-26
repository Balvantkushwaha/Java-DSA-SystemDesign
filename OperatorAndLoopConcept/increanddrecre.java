
public class increanddrecre {
    public static void main(String[] args) {
        int a = 3;
        int b = a++ + ++a;
        int c = 20;
        c++;
        System.out.println(a); // a=5
        System.out.println(b); // b=8
        System.out.println(c); // c=21
    }
}
