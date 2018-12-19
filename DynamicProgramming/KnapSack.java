package DynamicProgramming;

import java.util.Scanner;

public class KnapSack {
    public static void main(String[] args) {
        /*
        Given weights and values of n items,
        put these items in a knapsack of capacity W to get the maximum total value in the knapsack.
         In other words, given two integer arrays val[0..n-1] and wt[0..n-1] which represent values and weights associated with n items respectively.
          Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W.
           You cannot break an item, either pick the complete item, or don’t pick it (0-1 property).
         */
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int W = 50;
        int n = val.length;
        System.out.println(knapsackbetter(W, wt, val, n));
        System.out.println(knapsackWorst(W, wt, val, n));


    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int knapsackWorst(int w, int wt[], int val[], int n) {
        if (n == 0 || w == 0) {
            return 0;
        }
        if (wt[n - 1] > w) {
            return knapsackWorst(w, wt, val, n - 1);
        } else return max(val[n - 1] + knapsackWorst(w - wt[n - 1], wt, val, n - 1), knapsackWorst(w, wt, val, n - 1));
    }

    public static int knapsackbetter(int W, int wt[], int val[], int n) {
        int i, w;
        int k[][] = new int[n + 1][W + 1];
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    k[i][w] = 0;
                } else if (wt[i - 1] <= w) {
                    k[i][w] = max(val[i - 1] + k[i - 1][w - wt[i - 1]], k[i - 1][w]);
                } else {
                    k[i][w] = k[i - 1][w];
                }
            }
        }


        return k[n][W];
    }
}
