package Company;

import java.util.ArrayList;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;
//        IndexSumArray(arr,n,6);
//        System.out.println(subArraySum(arr,n,10));
        found(arr, n, 14);

    }

    public static void IndexSumArray(int arr[], int n, int sum) {
        int i, j, currSum;
        for (i = 0; i <= n; i++) {
            currSum = arr[i];
            for (j = i + 1; j <= n; j++) {
                if (currSum == sum) {
                    System.out.println("Indexx is found b/w         " + i + "found   " + (j - 1));
//                    break;
                }
                if (currSum > sum) {
                    break;
                }
                currSum = currSum + arr[j];
            }
        }

    }

    public static int subArraySum(int arr[], int n, int sum) {
        int curr_sum, i, j;

        // Pick a starting point
        for (i = 0; i < n; i++) {
            curr_sum = arr[i];

            // try all subarrays starting with 'i'
            for (j = i + 1; j <= n; j++) {
                if (curr_sum == sum) {
                    int p = j - 1;
                    System.out.println("Sum found between indexes " + i
                            + " and " + p);
                    return 1;
                }
                if (curr_sum > sum || j == n)
                    break;
                curr_sum = curr_sum + arr[j];
            }
        }

        System.out.println("No subarray found");
        return 0;
    }

    public static void found(int arr[], int n, int sum) {
        int currsum, i, j;
        boolean found = false;
        for (i = 0; i < n; i++) {
            currsum = arr[i];
            for (j = i + 1; j <= n; j++) {
                if (currsum == sum) {
                    System.out.println((i + 1) + " " + (j));
                    found = true;
                    return;

                }
                if (currsum > sum || j == n) {
                    break;
                }
                currsum = currsum + arr[j];
            }

        }
        if (found == false) {
            System.out.println(-1);
        }
    }
}
