package Placement;

import java.util.Arrays;
import java.util.Collections;

public class CountInversion {
    //    The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
    public static void main(String[] args) {
        int arr[]={1,20,6,4,5};
        inversion(arr);
        Arrays.sort(arr);
        Collections.reverseOrder();
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void inversion(int arr[]){
        int count=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
