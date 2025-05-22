import java.util.LinkedList;
import java.util.Queue;

public class stackusingqueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();
    // insert data in stack using queue
    // time complexity O(n) 
    static void insert(int Data){
      // 1. Move all the element from q1 to q2  
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.poll();
        }

    // 2.insert new data in q1 
     q1.add(Data);

    // 3. Move back all element from q2 to q1 
     while (!q2.isEmpty()) {
        q1.add(q2.peek());
        q2.poll(); // fornt element remove if isempty null return 
     }

    }
    // to delete data in stack using queue
    // timecomplexity O(1) 
    static int remove(){
        if(q1.isEmpty()){
            System.out.println("Queue under flow");
            System.exit(0);
        }
        int ele = q1.peek();
        q1.poll();
        return ele ;
    }
    public static void main(String[] args) {
        stackusingqueue s = new stackusingqueue();
        s.insert(2);
        s.insert(4);
        s.insert(6);
        s.insert(10);
     
        System.out.println("Delete element from stack "+s.remove());
    }
}
