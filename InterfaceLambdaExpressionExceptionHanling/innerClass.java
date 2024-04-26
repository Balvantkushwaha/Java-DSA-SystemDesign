package PwskillJava.InterfaceLambdaExpressionExceptionHanling;

class A {
    void show() {
        System.out.println("in show");
    }

    class B { // if class static is : then object A.B obj1 = new A.B();
              // if else then object A.B obj1 = obj.new B();
        void display() {
            System.out.println("innner classs");
        }
    }
}

public class innerClass {
    private static final String A = null;

    public static void main(String[] args) {
        A obj = new A();
        A.B obj1 = obj.new B();// objct creat is B classs
        obj.show();
        obj1.display();
    }
}
