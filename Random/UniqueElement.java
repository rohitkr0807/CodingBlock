package Random;

import java.util.*;

public class UniqueElement {
    public static void main(String[] args) {
        /*
        Given an array which contains all elements occurring k times, but one occurs only once. Find that unique element.
         */
        int arr[] =  { 6, 2, 5, 2, 2, 6, 6 };
        int n = arr.length;
        int k = 3;
        System.out.println(element(arr, k, n));

    }

    public static int element(int arr[], int k, int n) {
        Arrays.sort(arr);
        int i = 0;
        while (i + k - 1 < n) {
            if (arr[i] == arr[i + k - 1]) {
                i = i + k - 1;
            } else {
                return arr[i];
            }
            i++;
        }
        if (arr[n - 1] != arr[n - 2]) {
            return arr[n - 1];
        }
        return 0;
    }
}
