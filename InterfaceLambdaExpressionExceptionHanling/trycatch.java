package InterfaceLambdaExpressionExceptionHanling;

public class trycatch {

    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 2;
        int result = 0;
        String name = null;
        int value[] = { 2, 4, 6, 7 };
        try {
            result = num1 / name.length();
            System.out.println(value[6]);

        } catch (ArithmeticException e) {
            // num2 = 2;
            // result = num1 / num2;
            System.out.println("con not dived by 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            /// System.out.println(value[value.length - 1]);
            System.out.println("stay in your limit");
        } catch (Exception e) {
            System.out.println("something wrong ...." + e);
        }
        System.out.println(result);
        System.out.println("Bye ");
    }
}
