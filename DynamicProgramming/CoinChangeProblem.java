package DynamicProgramming;

import java.util.*;

public class CoinChangeProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] c = new int[m];
        for (int c_i = 0; c_i < m; c_i++) {
            c[c_i] = in.nextInt();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        int  ways = getWays(n, c);
        System.out.println(ways);
    }

    public static int getWays(int total, int[] coins) {
        int temp[][] = new int[coins.length + 1][total + 1];
        for (int i = 0; i <=coins.length ; i++) {
            temp[i][0]= 1;
        }
        for (int i = 1; i <=coins.length ; i++) {
            for (int j = 1; j <=total ; j++) {
                if(coins[i-1]>j){
                    temp[i][j]= temp[i-1][j];
                }else{
                    temp[i][j]= temp[i][j-coins[i-1]]+temp[i-1][j];
                }
            }
        }


        return temp[coins.length][total];
    }
}

