package Array;

import java.util.Scanner;
import java.util.*;

public class ArrayDisplay {
    public static void main(String[] args) {
//        Scanner scrn = new Scanner(System.in);
//        char ch= scrn.next().charAt(1);
//        System.out.println(ch);
//        System.out.println("Enter the size of array");
//        int n = scrn.nextInt();
//        int arr[] = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scrn.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        int arr[]={2,4,5,7,17,8};
//        System.out.println(max(arr));
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        bubblesort(arr);
    }

    public static int BinarySearch(int arr[], int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Number is present");
            } else {
                return -1;
            }

        }
        return value;
    }
    public static int max(int arr[]){
        int a= arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>a){
                a= arr[i];
            }
        }
        return a;
    }
    public static void bubblesort(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }

            }
            System.out.print(arr[i]+" ");


        }


    }
}
