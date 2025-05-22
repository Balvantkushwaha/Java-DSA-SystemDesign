import java.util.ArrayDeque;
import java.util.Deque;

public class dequeimp {
   public static void main(String[] args) {
       Deque<Integer> deque = new ArrayDeque<>();
       deque.addLast(3);
       deque.addFirst(4);
       deque.addLast(5);
       System.out.println("Deque output looks "+ deque);
       deque.removeFirst();
       System.out.println("Deque output after delete "+deque);
   }

}
