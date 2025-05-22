import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18 || age < 60) {
            if (age <= 30) {
                System.out.print("adult");
            } else if (age > 30) {
                System.out.print("you are old man");
            }

        }

        else {
            System.out.print("kid ");
        }
    }

}
