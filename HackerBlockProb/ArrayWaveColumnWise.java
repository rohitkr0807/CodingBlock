package HackerBlockProb;

import java.util.Scanner;

public class ArrayWaveColumnWise {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int m = scrn.nextInt();
        int n = scrn.nextInt();
        int a[][] = new int[m][n];
        printColumn(a, scrn, m, n);
    }

    public static void printColumn(int a[][], Scanner scrn, int m, int n) {

        for (int i = 0; i <m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scrn.nextInt();

                System.out.print(a[i][j]+ ", ");
            }

        }
        System.out.print("END");
    }
}
