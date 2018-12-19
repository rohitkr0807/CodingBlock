package InterviewBit;

import java.util.*;

public class FizzBuzz {
    public static int sumBitDifferences(int arr[], int n) {
        int ans = 0;  // Initialize result

        // traverse over all bits
        for (int i = 0; i < 32; i++)
        {
            // count number of elements with i'th bit set
            int count = 0;
            for (int j = 0; j < n; j++)
                if ( ((1 << i) > arr[j])  )
                    count++;

            // Add "count * (n - count) * 2" to the answer
            ans += (count * (n - count) * 2);
        }

        return ans;
    }
    // Driver prorgram
    public static void main(String args[]) {
        int arr[] = {96, 96, 7, 81, 2, 13};
        System.out.println(sumBitDifferences(arr,6));
    }
}


