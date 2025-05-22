// largest area of histogram 
package Stack;

import java.util.Scanner;
import java.util.Stack;

public class histogram {
    public static int previouse_smaller(int[] height, int n){
        Stack<Integer> stack = new Stack<>();
        int[] pre_small = new int[n];
        //pop element that are greater than or equal to current element
        for(int i =0;i<n-1;i++){
           while (!stack.isEmpty() && stack.peek()>=height[i]) {
              stack.pop();
           }
           // if stack is empty no smaller exits 
           if(stack.isEmpty()){
            pre_small[i] =-1;
           }else{
            pre_small[i]=stack.peek();
           }
           // push current element into stack
           stack.push(height[i]);
        }   
        return pre_small[4];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height[]  = new int[n];
        for(int i=0;i<n;i++){
            height[i]= sc.nextInt();
        }
       
       System.out.println(previouse_smaller(height , n)); 
    }
}
