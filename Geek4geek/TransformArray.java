package Geek4geek;

import java.util.ArrayList;
import java.util.Scanner;

public class TransformArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int[] arr = new int[scanner.nextInt()];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = scanner.nextInt();
            }
            StringBuilder sb = new StringBuilder();
            for (int num : transformArray(arr)) {
                sb.append(num + " ");
            }
            System.out.println(sb);
        }
        scanner.close();
    }

  public static int[] transformArray(int[] arr) {
        int[] transformedArr = new int[arr.length];
        int validLeft = 0;
        int invalidRight = arr.length - 1;
        int currentInd = 0;
        int nextInd = 0;
        while (true) {
            while (currentInd < arr.length && arr[currentInd] == 0) {
                transformedArr[invalidRight--] = 0;
                currentInd++;
            }
            if (currentInd == arr.length) {
                break;
            }
            nextInd = currentInd + 1;
            while (nextInd < arr.length) {
                if (arr[nextInd] == 0) {
                    transformedArr[invalidRight--] = 0;
                    nextInd++;
                } else {
                    if (arr[nextInd] == arr[currentInd]) {
                        arr[currentInd] += arr[nextInd];
                        arr[nextInd] = 0;
                    } else {
                        break;
                    }
                }
            }
            if (nextInd == arr.length) {
                transformedArr[validLeft] = arr[currentInd];
                break;
            } else {
                transformedArr[validLeft++] = arr[currentInd];
                currentInd = nextInd;
            }
        }
        return transformedArr;
    }
}