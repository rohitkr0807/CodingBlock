package HackerBlockProb;

import java.util.Arrays;
import java.util.Scanner;

public class KthLargest {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int k= scrn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]= scrn.nextInt();
        }
        System.out.println(klargest(arr, k));
    }
    public static int klargest(int arr[], int k){
        Arrays.sort(arr);
        int a= arr[k];
        return a;

    }
}