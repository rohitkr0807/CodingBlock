package Geek4geek;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallest {
    public static void main(String[] args) throws Exception {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();
        }
//        int k = scrn.nextInt();
//        Klargest(arr, k);
        Sort(arr);
        display(arr);

    }

    public static void Klargest(int arr[], int k) throws Exception {
        int retVal = 0;
        Arrays.sort(arr);
        if (k < 0 || k > arr.length) {
            throw new Exception("Invalid number");
        }
        System.out.println(arr[arr.length - k]);


    }

    public static void Sort(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] > arr[end]) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;


        } else if (arr[start] < arr[end]) {
            start++;
            end--;


        } else if (arr[start] == arr[end]) {
            start++;

        }

    }
    public static void display(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
