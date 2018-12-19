package PracticeTest;

import java.util.*;

public class OccuringElement {
    /*
    Given an array of positive integers. All numbers occur even number of times except one number which occurs odd number of times. Find the number in O(n) time & constant space.


     */
    public static void main(String args[]) {
        int arr[] = {2, 3, 3, 4, 2, 4, 3, 3,3,3,3,3,5};
        int n = arr.length;
        System.out.println(oddNumberElement(arr, n));
        System.out.println(oddOccurance(arr,n));

    }

    public static int oddNumberElement(int arr[], int n) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                int val = map.get(arr[i]);
                map.put(arr[i], val + 1);
            } else {
                map.put(arr[i], 1);
            }

        }
        for(Integer a: map.keySet()){
            if(map.get(a)%2!=0){
                return a;
            }
        }
        return -1;

    }
    public static int oddOccurance(int arr[],int n){
        int xor=0;
        for (int i = 0; i <n ; i++) {
            xor=arr[i]^xor;
        }
        return xor;
    }
}
