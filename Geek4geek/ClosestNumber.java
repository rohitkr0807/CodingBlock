package Geek4geek;

import java.util.Scanner;
import java.util.Stack;

public class ClosestNumber {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int t = scrn.nextInt();


        while (t > 0) {
            int n = scrn.nextInt();
            int m = scrn.nextInt();
            closestNum(n, m);
            t--;
        }

    }

    public static void closestNum(int n, int m) {
        Stack s = new Stack();
        int i = 0;
        s.push(n);
        s.push(m);
        if (n % m == 0) {
            System.out.println(n);
        } else {
            int k = n % m;
            if (k > 0 && k < m / 2) {
                System.out.println(n - k);
            } else if (k > 0 && k >= m / 2) {
                int l = m % k;
                if (l == 0) {
                    System.out.println(n + k);
                } else {
                    System.out.println(n + l);
                }
            } else if (k < 0 && (Math.abs(k) < m / 2) && (n > 0 || m > 0)) {
                System.out.println(n + Math.abs(k));
            } else if (k < 0 && (Math.abs(k) >= m / 2) && (n > 0 || m > 0)) {
                int l = m % Math.abs(k);
                System.out.println(n - l);
            }
        }
        if (n < 0 && m < 0) {
            int k = n % m;
            int K = Math.abs(n % m);
            int M = Math.abs(m);
            if (k < 0 && K < M / 2) {
                System.out.println(n + K);
            } else if (k < 0 && K >= M / 2) {
                int r = M % K;
                if (r == 0) {
                    System.out.println(n + k);
                } else {
                    System.out.println(n - r);
                }
            }


        }

    }
}
