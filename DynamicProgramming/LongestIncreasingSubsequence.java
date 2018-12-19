package DynamicProgramming;
import java.util.*;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();
        l.add(84);
        l.add(80);
        l.add(27);
//        l.add(1);
        int n= l.size();
        System.out.println(longestSeq(l));


    }
    public static int longestSeq(final List<Integer> a){
        int n= a.size();
        int lis[] = new int[n];
        int i,j,max = 0;

		/* Initialize LIS values for all indexes */
        for ( i = 0; i < n; i++ )
            lis[i] = 1;

		/* Compute optimized LIS values in bottom up manner */
        for ( i = 1; i < n; i++ )
            for ( j = 0; j < i; j++ )
                if ( a.get(i) > a.get(j) && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;

		/* Pick maximum of all LIS values */
        for ( i = 0; i < n; i++ )
            if ( max < lis[i] )
                max = lis[i];

        return max;
    }

}
