package Geek4geek;

import Array.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int t = scrn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scrn.nextInt();
            PosNeg(n, scrn);
        }
    }

    public static void PositiveNeg(int n, Scanner scrn) {
        int arr[] = new int[n];
        ArrayList pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
            if (arr[i] < 0) {
                neg.add(arr[i]);
            } else {
                pos.add(arr[i]);
            }
        }

        int counterpositive = 0;
        int counternegatiove = 0;
        for (int i = 0; i < neg.size() * 2; i++) {
            if (i % 2 == 0) {
                if (counterpositive < pos.size()) {
                    System.out.print(pos.get(counterpositive) + " ");
                    counterpositive++;
                }
            } else {
                if (counternegatiove < pos.size()) {
                    System.out.print(neg.get(counternegatiove) + " ");
                    counternegatiove++;
                }
            }
        }
        System.out.println();

    }

    public static void PosNeg(int n, Scanner scrn) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();

        }
        Arrays.sort(arr);
        int a = 0;
        int b = 0;
        int c = arr.length - 1;

        while (c>b) {
            System.out.print(arr[c] + " ");
            System.out.print(arr[b]+ " ");
            b++;
            c--;

        }
    }
}
