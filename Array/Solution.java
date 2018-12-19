package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    static int traderProfit(int k, int n, int[] A) {
        int i=0;
        int j=1;
        int sum=0;
        while (n!=0){
            if(A[i]>A[j] && j<n-1 && i<n-1){
                 sum= A[i]+A[j];
            }
            j++;
            n++;
        }


        return sum;
    }




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            int k = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int arr_i = 0; arr_i < n; arr_i++) {
                arr[arr_i] = in.nextInt();
            }
            int result = traderProfit(k, n, arr);
            System.out.println(result);
        }
        in.close();
    }
}
