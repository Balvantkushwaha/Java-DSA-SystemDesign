//Write a java program to calculate the sum of all elements in an integer array?

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the array of size 1D Array");
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        } 
        int sum =0;
        for(int i= 0;i<n;i++){
            System.out.print(arr[i]);
            sum+=arr[i];
            System.out.print("\t");
        }
        System.out.print("sum of array = ");
        System.out.println(sum);

    }
}
