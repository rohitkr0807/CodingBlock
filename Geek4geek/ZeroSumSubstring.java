package Geek4geek;

import java.util.HashMap;

public class ZeroSumSubstring {
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        int n= arr.length;
        System.out.println("Length of the longest 0 sum subarray is "
                + maxLen(arr,n));

    }
    public static int maxLen(int arr[], int n){
        HashMap<Integer,Integer> hm= new HashMap<>();
        int sum=0;
        int maxLen=0;
        for (int i = 0; i <n ; i++) {
            sum+=arr[i];
            if(arr[i]==0 && maxLen==0){
                maxLen=1;
            }
            if(sum==0){
                maxLen=i+1;
            }
            Integer prevI=hm.get(sum);
            if(prevI!=null){
                maxLen=Math.max(maxLen,i-prevI);
            }else{
                hm.put(sum,i);
            }
        }
        return maxLen;
    }
    public static int maxLengthSumZeoSubarray(int arr[], int n){
        int max_len = 0;

        // Pick a starting point
        for (int i = 0; i < n; i++)
        {
            // Initialize curr_sum for every
            // starting point
            int curr_sum = 0;

            // try all subarrays starting with 'i'
            for (int j = i; j < n; j++)
            {
                curr_sum += arr[j];

                // If curr_sum becomes 0, then update
                // max_len
                if (curr_sum == 0)
                    max_len = Math.max(max_len, j-i+1);
            }
        }
        return max_len;
    }
}
