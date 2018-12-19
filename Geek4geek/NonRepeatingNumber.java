package Geek4geek;

import java.util.Arrays;
import java.util.Scanner;

public class NonRepeatingNumber {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int t = scrn.nextInt();
        while (t-- > 0) {
            int p = scrn.nextInt();
            int n = 2 * p + 2;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scrn.nextInt();
            }
            number(arr,n);

        }


    }

    public static void number(int arr[], int n) {
        Arrays.sort(arr);
        int i = 0;

        while (i < n - 1) {
            if (arr[i] != arr[i + 1]) {
                System.out.print(arr[i] + " ");
            } else {
                i++;
            }
            i++;
        }
        if (arr[n - 1] != arr[n - 2]) {
            System.out.print(arr[n - 1]);
        }
        System.out.println();
    }
}
