package PwskillJava.InterfaceLambdaExpressionExceptionHanling;

@FunctionalInterface
interface car {
    void drive(int avg, int st);

}

public class AICDemo {
    public static void main(String[] args) {
        car obj = (avg, st) -> {
            System.out.println("Driving ..." + avg + " " + st);
        };

        obj.drive(16, 140);
    }
}
/*
 * if class first one bar hi use karna hai to is prakar
 * se impplement kar sakte hai
 * if class ko multiple use karna hai to alag se class banayege.
 */