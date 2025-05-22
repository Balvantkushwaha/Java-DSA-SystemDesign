public class LinkedList{
    Node head ;
    class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    // insert the node at the end int the linked list 
    public void insertAtEnd(int newData){
        // intialize the newNode with the newData entered the user
        Node newNode = new Node(newData);
         // linked list is empty       
         System.out.println(newNode);     

          if(head == null){
            head = new Node(newData);
            return;
          }
          // Linked list is not empty 
          newNode.next = null;
          // traversing the linkedlist at the end of the node 
          System.out.println(head+" is a new data");
          Node temp = head;
          while (temp.next!=null) {
             temp = temp.next;
          }
        temp.next=newNode;
    }
    // inplementation of insertion of a node the begining
    public void insertAtBeginning(int newData){
        Node newNode = new Node(newData);
        newNode.next=head;
        head= newNode;
    }
    // checks whether the value x is present in linked list
    public boolean search(Node head , int x){
        Node current = head;
        while (current!=null) {
            if(current.data==x){
                return true; // datt found                 
            }
           current  = current.next;
        }
         return false;
    }
    // implementatation for insertion fo a node aftering  node
    public void insertAnyNode(Node pre_node, int newData){
        if(pre_node==null){
            System.out.println("The Previous node cannot contain null values");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next= pre_node.next;
        pre_node.next=newNode;

    } 
    // Implementation of deletion of a node in a linkedlist 
    public void deleteNode(int position){
        // linked list is empty
        if(head==null){
            return;
        }
        Node temp  = head;
    // deletion is in the begining of the node 
    if (position==0){
        head=temp.next;
        return;
    }
    // deletion is not in the begining of the node 
     for(int i=0; temp!=null&&i<position-1;i++){
          temp = temp.next;
     }
     temp.next=temp.next.next;
    }
    // implementation of reversal of  a node in a linked list 
    public void reverseLL(){
        Node curr = head;
        Node nextPtr = null;
        Node prev = null;
        while(curr!=null){
            nextPtr = curr.next;
            curr.next= prev;
            prev = curr;
            curr = nextPtr;

        }
        head = prev;
        return;
    }
    // implementation of reversal fo a kinked list using recursive approach .
    public void reversalRec(Node curr , Node prev){
        // last node a linked list 
        if(curr.next==null){
            head=curr;
            curr.next=prev;
            return;
        }
        Node nextPtr = curr.next;
        curr.next= prev;
        reversalRec(nextPtr ,curr);
    }
    // Implementation of finding of middle data in a linked list 
    public void middleNode(){
        Node slow = head , fast = head;
        while (fast!=null && fast.next!=null) {
              slow =slow.next;
              fast =fast.next.next;       
        }
        System.out.println("Middle Node "+slow.data);
    }
    //implementation of detecting the loop in a linked list 
    public void detectLoop(){
        int flag = 0;
        Node slow = head, fast = head;
        while (slow!=null && fast!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
             if(slow == fast) {
                flag =1;
                System.out.println("flag = "+flag);
                break;
             }
        }
        if(flag == 0){
            System.out.println("Not a  loop Detecting");
        }
        else{
            System.out.println("Loop is a detected ");
        }
    }
    // display all the nodes after the insertion 
     public void printNodes(){
        Node current = head;
        while (current!=null) {
            System.out.println(current.data+" ");
            current = current.next;
        }
     }
    public static void main(String[] args) {
            System.out.println("Hello linked list");
            LinkedList llist = new LinkedList();
            // funcing calling 
            llist.insertAtEnd(2);
            llist.insertAtEnd(4);
            llist.insertAtEnd(6);
            llist.insertAtEnd(10);
            llist.insertAtEnd(12);
           // llist.insertAtBeginning(2);
           // llist.insertAnyNode(llist.head.next.next, 8);
           // llist.deleteNode(4);
            // llist.printNodes();
            // if(llist.search(llist.head, 10)){
            //     System.out.println("Yes");
            // }
            // else{
            //     System.out.println("No");
            // }
            //System.out.println("linked list reversal ");
            //llist.reverseLL();
           // llist.reversalRec(llist.head, null);
           llist.printNodes();
            // System.out.println("Middle Node in a linked list ");
            // llist.middleNode();
            // System.out.println();
            // circular linkde list 

            // Node temp = llist.head;
            // while (temp.next!=null) {
            //     temp = temp.next; 
            // }
            // temp.next = llist.head;
            // llist.detectLoop();
            // System.out.println();
    }
}
