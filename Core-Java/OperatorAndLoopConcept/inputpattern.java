import java.util.Scanner;

public class inputpattern {
    public static void main(String[] args) {
        int i, j, n;
        System.out.println("enter the squar no... ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n; j++) {

                if (i == j || i == 0 || j == 0 || i == n || j == n || i + j == n || i + j == n / 2 || i - j == n / 2
                        || j - i == n / 2 || i + j == n + n / 2) {

                    System.out.print("* ");
                }

                else

                {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }

}
