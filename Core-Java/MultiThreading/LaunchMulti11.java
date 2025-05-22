package MultiThreading;
class Example implements Runnable{
    public void run(){
        for(int i=0;i<3;i++){
            try {
             System.out.println("Focus is important");
             Thread.sleep(2000);
            } catch (Exception e) {
              // TODO: handle exception
              System.out.println("Thread is interred ");
           }
        }
   } 
}
public class LaunchMulti11 {
    public static void main(String[] args) {
        Example ex = new Example();
        Thread t1 = new Thread(ex);
        t1.start();
        t1.interrupt();
    }
}
