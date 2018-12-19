package Array;

import java.util.Scanner;

public class QuestionTwoD {
    public static void main(String[] args) {

        int arr[][] = {{11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}, {41, 42, 43, 44}, {31, 32, 33, 34}, {41, 42, 43, 44}};
//        display(arr);
//        System.out.println(arr.length);
//        System.out.println(takeinput());
//        display(takeinput());
        waveprint(arr);
    }

    public static int[][] takeinput() {
        Scanner scrn = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = scrn.nextInt();
        int[][] arr = new int[row][];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number of cols in" + (i + 1) + "th row");
            int cols = scrn.nextInt();
            arr[i] = new int[cols];
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter the value for ( " + (i + 1) + "," + (j + 1) + ") cell");
                arr[i][j] = scrn.nextInt();

            }
        }
        return arr;
    }

    public static void display(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void waveprint(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

}

