package Geek4geek;

import java.util.Arrays;
import java.util.Scanner;

public class KLargestElement {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int t = scrn.nextInt();
        while (t > 0) {
            KelementDecresing(scrn);


            t--;
        }
    }

    public static void KelementDecresing(Scanner scanner) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= k; i--) {
            System.out.println(arr[i]);
        }
    }
}
