package HackerRank;

import java.util.Scanner;

public class SumDiagonal {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scrn.nextInt();
            }
        }
        int count=n-1;
        int firstdiagonal=0;
        int secondDiagonal=0;

        for (int i = 0; i <n ; i++) {
            firstdiagonal+=arr[i][i];
            secondDiagonal+= arr[count][i];
            count--;
        }
        int sum= Math.abs(firstdiagonal-secondDiagonal);
        System.out.println(sum);
    }
}
