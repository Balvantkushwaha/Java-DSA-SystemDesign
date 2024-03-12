interface A 
{
    void show();
}
interface x
{
     void abc();
}
class B implements A, x {
    public void show(){
        System.out.println("in show");
    }
    public void abc(){
        System.out.println("in show interface");
    }
}
public class demo1{
    public static void main(String[] args) {
             B obj = new B();
             obj.show(); 
             obj.abc();
    }
}