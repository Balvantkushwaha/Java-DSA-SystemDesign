package MultiThreading;
class MyThread extends Thread{
    public void run(){
        System.out.println("child Thread");
    }
}
public class LaunchMulti3 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
