package DynamicProgramming;

public class NumberOfWaysToCoverDistance {
    public static void main(String[] args) {
        /*
        Input:  n = 3
Output: 4
Below are the four ways
 1 step + 1 step + 1 step
 1 step + 2 step
 2 step + 1 step
 3 step

Input:  n = 4
Output: 7

         */
        System.out.println(countways(4));
        System.out.println(countbetterWays(4));
    }

    public static int countways(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return countways(n - 1) + countways(n - 2) + countways(n - 3);
    }

    public static int countbetterWays(int n) {
        int count[] = new int[n + 1];
        count[0] = 1;
        count[1] = 1;
        count[2] = 2;
        for (int i = 3; i <= n; i++) {
            count[i] = count[i - 1] + count[i - 2] + count[i - 3];
        }
        return count[n];
    }
}

