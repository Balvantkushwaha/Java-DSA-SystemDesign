public class cal {
    public static void main(String[] args) {
        int a[][] = { { 2, 3, 4, 5 }, { 5, 6 }, { 8, 9, 10 } };
        // a[0][0] = 2;
        // a[0][1] = 3;

        // a[0][2] = 4;
        // a[0][3] = 5;
        // a[1][1] = 6;
        // a[1][2] = 7;
        // a[2][0] = 8;
        // a[2][1] = 9;
        // a[2][2] = 10;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
