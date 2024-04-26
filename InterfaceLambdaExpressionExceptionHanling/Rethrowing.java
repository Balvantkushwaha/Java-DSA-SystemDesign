package PwskillJava.InterfaceLambdaExpressionExceptionHanling;

import java.io.IOException;

class MyException extends Exception {
    MyException() {

    }

    MyException(String message) {
        super(message);
    }

}

public class Rethrowing {
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = -4; // create excation
        int result = 0;

        try {
            if (num2 < 0) {
                // creae now exception
                Exception e = new MyException("  my exception");
                throw e;
            } else {
                result = num1 / num2;
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println("enter a valid number" + e.getMessage());
        }
    }
}
