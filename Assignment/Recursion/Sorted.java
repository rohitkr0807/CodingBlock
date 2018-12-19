package Assignment.Recursion;

import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {
        Scanner scrn= new Scanner(System.in);
        int n= scrn.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=scrn.nextInt();
        }
        for(int arrr: arr){
            System.out.print(arrr+ " ");
        }
        System.out.println();
        System.out.println(isSortedArray(arr,0));

    }
    public static boolean isSortedArray(int arr[], int si){
        if(si==arr.length-1){
            return true;
        }
        if(arr[si]>arr[si+1]){
            return false;
        }else{
            boolean isSorted= isSortedArray(arr,si+1);
            return isSorted;
        }
    }
}
