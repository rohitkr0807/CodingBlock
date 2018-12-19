package InterviewBit;

import java.util.ArrayList;
import java.util.List;

public class LongestSubsequence {
    public static void main(String[] args) {
        ArrayList A= new ArrayList();
        A.add(0);
        A.add(2);
        A.add(4);
        A.add(1);
        A.add(3);
        System.out.println(A);

    }
    public static int longestSublength(final List<Integer> A){
       int length= A.size();
       int i,j;
       int n= A.size();
       int arr[]= new int[length];
        for ( i = 0; i <length ; i++) {
            arr[i]=A.get(i);
        }
        int[] lis = new int[n];
        for (i = 0; i < n; i++)
            lis[i] = 1;

        /* Compute LIS values from left to right */
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;

        /* Allocate memory for lds and initialize LDS values for
            all indexes */
        int[] lds = new int [n];
        for (i = 0; i < n; i++)
            lds[i] = 1;

        /* Compute LDS values from right to left */
        for (i = n-2; i >= 0; i--)
            for (j = n-1; j > i; j--)
                if (arr[i] > arr[j] && lds[i] < lds[j] + 1)
                    lds[i] = lds[j] + 1;


        /* Return the maximum value of lis[i] + lds[i] - 1*/
        int max = lis[0] + lds[0] - 1;
        for (i = 1; i < n; i++)
            if (lis[i] + lds[i] - 1 > max)
                max = lis[i] + lds[i] - 1;

        return max;

    }
}
