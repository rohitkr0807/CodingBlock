package Geek4geek;

import java.util.Scanner;

public class ChocolateStation {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int t = scrn.nextInt();
        while (t > 0) {
            int n = scrn.nextInt();
            int x = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int val = scrn.nextInt();
                if (val > x) {
                    x = val;
                }
            }
            int p = scrn.nextInt();
            System.out.println(p * x);

            t--;
        }
    }
}
