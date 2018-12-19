package HackerBlockProb;

import java.util.Scanner;

public class FactorialModulo {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);

        int n = scrn.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scrn.nextInt();
        }
        System.out.println(factorialmodulo(num));
    }

    public static int factorialmodulo(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = fact(arr[i]);
            sum = sum + a;
        }
        return sum%107;
    }

    public static int fact(int num) {
        if (num == 1) {
            return 1;
        }
        int f1 = fact(num - 1);
        int f2 = f1 * num;
        return f2;
    }
}
