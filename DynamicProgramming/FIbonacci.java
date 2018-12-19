package DynamicProgramming;

import java.util.Scanner;

public class FIbonacci {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        System.out.println(fibRec(n));
        System.out.println(fibBtr(n));

    }

    public static int fibRec(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRec(n - 1) + fibRec(n - 2);

    }

    public static int fibBtr(int n) {
        int f[] = new int[n + 1];
        int i;
        f[0] = 0;
        f[1] = 1;
        for (int j = 2; j <= n; j++) {
            f[j] = f[j - 1] + f[j - 2];
        }
        return f[n];
    }

    public static int fib(int n) {
        int a = 0;
        int b = 1;
        int c;
        if (n == 0) {
            return a;
        }
        for (int i = 2; i <=n ; i++) {
            c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}
