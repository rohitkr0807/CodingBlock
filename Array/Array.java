package Array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scrn.nextInt();

        }
        System.out.println(subarrays(arr, 10));
//        ReverseArray(arr);

    }

    //    public static void ReverseArray(int arr[]){
//
//        for (int i= arr.length-1; i>=0; i--){
//            System.out.print(arr[i] + " ");
//        }
//    }
    public static int subarrays(int arr[], int k) {
        int NoOfSubArray = 0;
        int a = 0;
        int b = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < k) {
                NoOfSubArray++;
            }else if((arr[a]*arr[b])<k){
                NoOfSubArray++;
                a++;
                b--;
            }


        }


        return NoOfSubArray;
    }
}
