package DSAStart.ComplexityAnalysisAndArray;

public class Palindrome {
        public static void main(String[] args) {
            int[] arr={1,3,5,3,1,5};
            int n = arr.length;
            int  Flag =0;
            for(int i=0;i<n/2;i++){
                if(arr[i]!=arr[n-i-1]){
                   System.out.println("Not a palindromic array");
                   Flag=1;
                   break;
                }
            }
            if(Flag==0){
            System.out.println("Palindrome array");
        }   
    }
}
