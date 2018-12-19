package Geek4geek;

import java.util.Arrays;
import java.util.Scanner;

public class MinNoElements {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int t = scrn.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scrn.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scrn.nextInt();
            }
            Arrays.sort(arr);
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]);
            }


        }
    }
}
