package HackerRank;
import java.util.*;

public class longSum {

    static long aVeryBigSum(int n, long[] ar) {
        long a=0;
        for (int i = 0; i <ar.length ; i++) {
            a=a+ar[i];
        }
        return a;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }

}
