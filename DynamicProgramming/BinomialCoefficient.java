package DynamicProgramming;

import java.util.Scanner;

public class BinomialCoefficient {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int k = scrn.nextInt();
        System.out.println(binomial(n, k));
    }

    public static int binomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        int ans = binomial(n - 1, k - 1) + binomial(n - 1, k);
        return ans;
    }

    public static int binBetter(int n, int k) {
        int c[][] = new int[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || j == i) {
                    c[i][j] = 1;
                } else {
                    c[i][j] = c[i - 1][j - 1] + c[i - 1][j];
                }
            }
        }


        return c[n][k];
    }
}
