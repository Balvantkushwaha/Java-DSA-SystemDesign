// Interview Problem : Two Sum 

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        // input array element in an array
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //input targer element in an array
        System.out.println("Enter the the target element in an array");
        int target =sc.nextInt();
        // create a hashmap where key is arr[i] and values is i
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],i);
        }
        // create a result array to display the inde3x of two numbers 
        int result[] = new int[2];
        //if current is equal to the target 
        result[0]=-1;
        result[1]=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==target && map.containsKey(0)){
                result[0]=i;
                result[1]=map.get(0);
                break;
            }
            else if(map.containsKey(target-arr[i])){
                // is the element non -repeatable 
                if(map.get(target-arr[i])>i){
                    result[0]=i;
                    result[1]=map.get(target-arr[i]);
                    break;
                }
            }
        }
        
        System.out.println("two sum index value are : ["+result[0]+","+result[1]+"]");
    }
}
