package Queue;

import java.util.Stack;

public class queueusingStack {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();
    // push all element stack1 
    static void enQueue(int data){
             stack1.push(data);       
    }
    //deletion of data form the queue -fifo
    static int  deQueue(){
          int ele ;
          // stack1 is empty aur stack2 is empty so is queue empty 
          if(stack1.empty() && stack2.empty()){
            System.out.println("Queue is empty");
            System.exit(0);
          }
          // push all the element from stack1 to stack2
          // time complexity: O(n)
          if(stack2.empty()){
              while(!stack1.empty()){
              ele=stack1.pop();
              stack2.push(ele);
            }
          }
     
          ele = stack2.pop();
          return ele;
    }
    public static void main(String[] args) {
        queueusingStack q = new queueusingStack();
        

        System.out.println(q.deQueue());


    }
}
