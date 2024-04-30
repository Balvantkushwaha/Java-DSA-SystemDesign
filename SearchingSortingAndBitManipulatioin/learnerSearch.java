package PwskillJava.SearchingSortingAndBitManipulatioin;

import java.util.Scanner;

public class learnerSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Please enter the array element");

        // array input
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // searching the element
        System.out.println("Please search elelment ");
        int x = sc.nextInt();

        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                idx = i;
                break;
            }

        }
        if (idx == x) {
            System.out.println("Your found the element" + idx);
        } else {
            System.out.println("your not found the elemment no. " + idx);
        }

    }
}
