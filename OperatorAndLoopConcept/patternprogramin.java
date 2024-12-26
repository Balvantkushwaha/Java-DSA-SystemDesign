public class patternprogramin {
    public static void main(String[] args) {
        int i, j, n = 10;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == 9 || j == 9) {
                    System.out.print("* ");
                }

                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}