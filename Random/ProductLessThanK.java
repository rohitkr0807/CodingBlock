package Random;

public class ProductLessThanK {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4};
        int n= arr.length;
        int k=10;
        int ans= countSubArrayLessThanK(arr,k,n);
        System.out.println(ans);

    }

    public static int countSubArrayLessThanK(int arr[], int k, int n) {
        int res = 0;
        long p = 1;
        for (int start = 0, end = 0; end < n; end++) {
            p = p * arr[end];
            while (start < end && p >= k) {
                p /= arr[start++];

            }
            if (p < k) {
                int len = end - start + 1;
                res += len;
            }
        }


        return res;
    }

}
