package SearchingSortingAndBitManipulatioin;
import java.util.Scanner;
public class BinarySearch {
    public static int binarySearchNo(int array[], int target) {
        int low = 0, high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (mid < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter of Array size by user");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array element ");
        // input element
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element");
        int x = sc.nextInt();

        // implementation
        int result = binarySearchNo(arr, x);
        if (result == 0) {
            System.out.println("searched element not found");
        } else {
            System.out.println("Searched element found");
        }

    }
}
