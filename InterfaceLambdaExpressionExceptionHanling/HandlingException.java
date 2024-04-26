package PwskillJava.InterfaceLambdaExpressionExceptionHanling;

class demo {
    public void a() throws Exception {

        b();
    }

    public void b() throws Exception {
        int num1 = 6;
        int num2 = 0;
        int result = num1 / num2;
        System.out.println(result);
    }
}

public class HandlingException {
    public static void main(String[] args) {
        demo obj = new demo();
        try {
            obj.a();
        } catch (Exception e) {
            System.out.println("can not devided by 0");
        }

    }
}
