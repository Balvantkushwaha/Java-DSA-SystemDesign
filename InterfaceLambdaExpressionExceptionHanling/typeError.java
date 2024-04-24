
public class typeError {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 0;
        int result = 0;
        try {
            result = num1 / num2;
            System.out.println("this is no try block ");
        } catch (Exception obj) { // obj
            System.out.println("some thing went wrong..." + obj);
        }
        System.out.println(result);
        System.out.println("Bye ");
    }
}
