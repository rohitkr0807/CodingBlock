package DynamicProgramming;

import java.util.Arrays;

public class DiceProblem {
    public static void main(String[] args) {
        /*
        Given n dice each with m faces, numbered from 1 to m,
        find the number of ways to get sum X.
        X is the summation of values on each face when all the dice are thrown.
         */
        int m = 6;
        int n = 3;
        int x = 18;
        System.out.println(ways(m, n, x));

    }

    public static int ways(int m, int n, int x) {
        int table[][] = new int[n + 1][x + 1];
        // get maximum value in every dice throw.

        Arrays.fill(table,0);
        for(int j=1;j<=m && j<=x;j++){
            table[1][j]=1;
        }
        for (int i = 2; i <=n ; i++) {
            for (int j = 1; j <=x ; j++) {
                for (int k = 1; k <=m && k<j ; k++) {
                    table[i][j]+=table[i-1][j-k];
                }
            }
        }


        return table[n][x];

    }
}
