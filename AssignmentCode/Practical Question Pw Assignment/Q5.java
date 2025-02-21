import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            // input element
            arr[i]=sc.nextInt();
        }
        System.out.println("print element");
        for(int i=0;i<n;i++){
            // output element
            System.out.print(" "+arr[i]);
        }
    }
}
