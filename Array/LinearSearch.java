package Array;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);

        System.out.println("Enter the total number");
        int n = scrn.nextInt();
//        int arr[] = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scrn.nextInt();
//        }
//        LinearSearchk(arr, 3);
//        BinarySearch(arr, 77);
//        FloydTriangle(n);
//        GenerateRandom(n);
//        printprime(n);
    }

    public static void LinearSearchk(int arr[], int k) {
        int counter = 0;
        while (arr.length > counter) {
            if (arr[counter] == k) {
                System.out.println("Number found");
                break;
            } else {
                System.out.println("Not found");
            }
            counter++;
        }
    }

    public static void BinarySearch(int arr[], int item) {
        int first = 0;
        int last = arr.length;
        int middle = (first + last) / 2;
        while (first < last) {
            if (arr[middle] < item) {
                first = middle + 1;
            } else if (arr[middle] == item) {
                System.out.println(item + " found at location " + (middle + 1));
                break;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Not found");
        }
    }

    public static void FloydTriangle(int row) {
        int counter, j;
        int number = 1;
        for (int i = 1; i <= row; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }

    }

    public static void GenerateRandom(int item) {
        Random rnum = new Random();
        for (int i = 0; i < item; i++) {
            System.out.println(rnum.nextInt(10));
        }
    }

    public static void printprime(int k) {
        int num = 3;
        int status = 1;
        if (k >= 1) {
            System.out.println(2);
        }
        for (int i = 2; i <= k; i++) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
    }

    public static boolean prime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            int temp = num % i;
            if (temp == 0) {
                return false;

            }

        }
        return true;
    }
}
