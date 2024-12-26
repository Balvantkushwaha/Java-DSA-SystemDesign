import java.util.Scanner;

public class first {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("even number");

        } else {
            System.out.println("odd number");
        }
    }
}