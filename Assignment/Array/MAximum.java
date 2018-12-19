package Assignment.Array;

import Array.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MAximum {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
//        int arr[] = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scrn.nextInt();
//        }

        int arr2[] = {1, 1, 2, 3, 3, 5, 6, 7};
        Target(arr2, n);
//        int max= getMAX(arr);
//        System.out.println(max);
//        int m= scrn.nextInt();
//        int Index= index(arr,m);
//        System.out.println(Index);
//        bubbleSort(arr);
//        SelectionSort(arr);
//        display(arr);
//        reverseArray(arr);
//        System.out.println(Intersection(arr, arr2));
    }

    public static int getMax(int arr[]) {
        int rv = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > rv) {
                rv = val;
            }
        }
        return rv;
    }

    public static int getMAX(int arr[]) {
        int rv = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > rv) {
                rv = arr[i];
            }
        }
        return rv;
    }

    public static int index(int arr[], int m) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == m) {
                return i;

            }
            Arrays.sort(arr);

        }
        return -1;


    }

    public static void reverseArray(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static void SelectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minidx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[minidx]) {
                    minidx = j;
                    int temp = arr[minidx];
                    arr[minidx] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void display(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println("END");
    }


    public static ArrayList Intersection(int arr1[], int[] arr2) {
        ArrayList rv = new ArrayList();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                rv.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }

        }
        return rv;
    }

    public static void Target(int arr[], int k) {
        Arrays.sort(arr);
        int a = 0;
        int b = arr.length - 1;
        if (arr[a] + arr[b] == k) {
            System.out.print(arr[a] + " " + arr[b]);
            a++;
            b--;
        } else if (arr[a] + arr[b] < k) {
            a++;
        } else {
            b--;
        }

    }

    public static void Add(int arr1[], int arr2[]) {
        int a = arr1.length;
        int b = arr2.length;
        System.out.println("END");

    }

    public static ArrayList getSubsets(int[] arr) {
        ArrayList retVal= new ArrayList();
        int range= (int) Math.pow(2, arr.length)-1;
        int counter=0;
        while (counter<=range){
            ArrayList inner= new ArrayList();
            int dec= counter;
            int ic=0;
            while (ic<arr.length){
                int rem= dec%2;
                if(rem==1){
                    inner.add(arr[ic]);
                }
                dec=dec/2;
                ic++;
            }
            retVal.add(inner);
            counter++;
        }
        return retVal;

    }

}
