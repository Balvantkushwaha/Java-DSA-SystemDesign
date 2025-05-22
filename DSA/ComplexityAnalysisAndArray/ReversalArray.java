package DSAStart.ComplexityAnalysisAndArray;

public class ReversalArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,8,5,8,7};
        int size = arr.length;
        for(int i=0;i<size/2;i++){
            int temp = arr[i];
            arr[i]=arr[size-i-1];
            arr[size-i-1]=temp;
        }
        System.out.println("Reverse of array ");
        for(int i =0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
      
    }
}
