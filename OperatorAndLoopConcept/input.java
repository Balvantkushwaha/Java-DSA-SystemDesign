
import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Student Detail Fill  full name , age , college ,class, address and mobile number");
        String name = sc.next();
        int age = sc.nextInt();
        System.out.print("name:" + name + "    age" + age);

        // System.out.print("age:" + age);
    }

}
