package Assignment.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumString {
    public static void main(String[] args) {
        int arr[] = {2, 5, 17, 23, 45};
        MaximumformedByArray(arr);


    }

    public static void MaximumformedByArray(int arr[]) {
        System.out.println();
        int rem = 0;
        StringBuilder sb = new StringBuilder();
        for (int val : arr) {
            while (val > 0) {
                rem = val % 10;
                sb.append(rem);
                val = val / 10;
            }
        }
        int arer[] = new int[sb.length() - 1];
        System.out.println(sb);
        for (int i = 0; i < sb.length(); i++) {
            arer[i] = sb.charAt(i);
            Arrays.sort(arer);
            System.out.print(arer[i]);
        }

    }
}
