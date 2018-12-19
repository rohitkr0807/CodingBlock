package PracticeTest;

import java.util.Scanner;
import java.util.*;

public class FunWithArray {
    /*
    For this challenge, you need to take integer as input on one line which will tell number of array elements and array elements as an input on another line and find the majority number and print that number to the stdout. If not found return -1.
     */
    public static void main(String args[]) {
        Scanner scrn = new Scanner(System.in);

        int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int n = arr.length;
//        int n= scrn.nextInt();
//        int arr[]= new int[n];
//        for (int i = 0; i <n ; i++) {
//            arr[i]= scrn.nextInt();
//        }
        System.out.println(majoritynum(arr, n));
        System.out.println(maxoccur(arr,n));

    }

    public static int majoritynum(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                count = map.get(arr[i]) + 1;
                if (count > n / 2) {
                    return arr[i];
                } else {
                    map.put(arr[i], count);

                }
            } else {
                map.put(arr[i], 1);
            }
        }
        return -1;
    }
    public static int maxoccur(int arr[], int n){
        for (int i = 0; i <n ; i++) {
            int count=0;
            for (int j = 0; j <n ; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/2){
                return arr[i];
            }
        }
        return -1;
    }
}
