package Geek4geek;

import java.util.Arrays;
import java.util.Scanner;

public class HighestNumber {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int t = scrn.nextInt();
        for (int i = 0; i <t ; i++) {
            int n= scrn.nextInt();
            maximum(scrn,n);

        }
    }

    public static void maximum(Scanner scrn, int n) {

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);


    }
}
