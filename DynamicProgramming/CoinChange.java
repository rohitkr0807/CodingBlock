package DynamicProgramming;

import java.util.Arrays;

public class CoinChange {
    /*

Dynamic Programming | Set 7 (Coin Change)
3.7

Given a value N, if we want to make change for N cents, and we have infinite supply of each of S = { S1, S2, .. , Sm} valued coins, how many ways can we make the change? The order of coins doesn’t matter.

For example, for N = 4 and S = {1,2,3}, there are four solutions: {1,1,1,1},{1,1,2},{2,2},{1,3}. So output should be 4. For N = 10 and S = {2, 5, 3, 6}, there are five solutions: {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}. So the output should be 5.
     */
    public static void main(String[] args) {
        int s[] = {1, 2, 3};
        int m = s.length;
        int n = 4;
        System.out.println(count(s, m, n));
        System.out.println(countbetter(s,m,n));

    }

    public static int count(int S[], int m, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (m <= 0 && n >= 1) {
            return 0;
        }
        return count(S, m - 1, n) + count(S, m, n - S[m - 1]);
    }
    public static int countbetter(int s[], int m, int n){
        int ans[]= new int[n+1];

        Arrays.fill(ans,0);
        ans[0]=1;
        for (int i = 1; i <m ; i++) {
            for (int j = s[i]; j <=n ; j++) {
                ans[j]+=ans[j-s[i]];
            }
        }



        return ans[n];
    }
}
