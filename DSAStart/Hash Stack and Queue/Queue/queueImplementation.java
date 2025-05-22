package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queueImplementation {
    public static void main(String[] args) {
         Queue<Integer> q = new LinkedList<>();
         // to add the data inside the queue - enqueue
         for(int i=0;i<10;i++){
            q.add(i);
         }
         System.out.println("Queue data looks like:"+q);
        // display the top element present in the queue
        System.out.println("the toop element in the queue before deletion is:"+q.peek());
        //to remove the element from the queue - dequeue
        q.remove();
        System.out.println("the top element in the queue after deletion is:"+q.peek());

        // to check the size of the queue
        System.out.println("The current size fo the queue is :"+q.size());
    }
}
