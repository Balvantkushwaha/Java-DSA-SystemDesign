package PwskillJava.InterfaceLambdaExpressionExceptionHanling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class multipleCatchBlock {
    public static void main(String[] args) {
        int num = 0;
        // Scanner sc = new Scanner(System.in);

        // try {
        // num = sc.nextInt();
        // } catch (InputMismatchException e) {
        // System.out.println("Something went errors ... please enter number" + e);
        // } finally {
        // sc.close();
        // System.out.println("resurce close ");
        // }
        // System.out.println(num);

        try (Scanner sc = new Scanner(System.in)) {
            num = sc.nextInt();
            System.out.println("resourse close");
        } catch (Exception e) {
            System.out.println("something went errors .... please enter number " + e.getMessage());
        }
        System.out.println(num);
    }
}
