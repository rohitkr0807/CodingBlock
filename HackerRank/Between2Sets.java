package HackerRank;

import java.util.*;

public class Between2Sets {

    static int getTotalX(int[] a, int[] b) {
        int multiple = 0;
        for (int i : b) {
            multiple = gcd(multiple, i);
        }
        int factor = 1;
        for (int i : a) {
            factor = lcm(factor, i);
            if (factor > multiple) {
                return 0;
            }
        }
        if (multiple % factor != 0) {
            return 0;
        }
        int value = multiple / factor;
        int max = Math.max(factor, value);
        int total = 1;
        for (int i = factor; i < multiple; i++) {
            if (multiple % i == 0 && i % factor == 0) {
                total++;
            }
        }
        return total;


    }

    public static int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a >= b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return a + b;
    }

    public static int lcm(int a, int b) {
        return a / (gcd(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for (int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
//        System.out.println(gcd(,5));
        in.close();
    }
}


