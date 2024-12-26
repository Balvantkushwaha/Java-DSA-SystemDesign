public class enhanced {
    public static void main(String[] args) {
        int nums[][] = { { 1, 3, 2, 4 }, { 1, 4, 5, 4 }, { 2, 5, 6, 7, 8 } };
        for (int a[] : nums) {
            for (int b : a)

            {
                System.out.print(b + " ");
            }
            System.out.println();
        }

    }

}
