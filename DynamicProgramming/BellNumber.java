package DynamicProgramming;

public class BellNumber {
    public static void main(String[] args) {
        /*
        Given a set of n elements, find number of ways of partitioning it.

Input:  n = 3
Output: Number of ways = 5
Explanation: Let the set be {1, 2, 3}
             { {1}, {2}, {3} }
             { {1}, {2, 3} }
             { {2}, {1, 3} }
             { {3}, {1, 2} }
             { {1, 2, 3} }.
         */
        System.out.println(NumberOfWays(4));

    }
    public static int NumberOfWays(int n){
        int bell[][]= new int[n+1][n+1];
        bell[0][0]=1;
        for (int i = 1; i <=n ; i++) {
            bell[i][0]=bell[i-1][i-1];
            for (int j = 1; j <=n ; j++) {
                bell[i][j]= bell[i-1][j-1]+bell[i][j-1];
            }

        }



        return bell[n][0];
    }
}
