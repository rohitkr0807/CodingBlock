package HackerEarth;

import java.util.Scanner;

public class MonkInversion {
    public static void main(String args[]) {
        Scanner scrn = new Scanner(System.in);
        int t = scrn.nextInt();
        while (t-- > 0) {
            int n = scrn.nextInt();
            int arr[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = scrn.nextInt();
                }
            }
            System.out.println(inversion(arr,n));

        }


    }
    public static int inversion(int arr[][],int n){
        int count=-1;
        for (int i = 0; i <n-1; i++) {
            for (int j = 0; j <n-1; j++) {
                if(arr[i][j]>arr[i+1][j+1]){
                    count++;
                } if(arr[i][j]>arr[i][j+1]){
                    count=count+1;}
                 if(arr[i][j]>arr[i+1][j]){
                    count=count+1;}
            }
        }
       return count+1;

    }
}
