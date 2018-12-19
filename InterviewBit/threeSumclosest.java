package InterviewBit;

import java.util.ArrayList;
import java.util.Collections;

public class threeSumclosest {
    public static int threeSum(ArrayList<Integer> a, int b) {
        Collections.sort(a);
        int min = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < a.size(); i++) {
            int j = i + 1;
            int k = a.size() - 1;
            while (j < k) {
                int sum = a.get(i) + a.get(j) + a.get(k);
                int diff = Math.abs(sum - b);
                if (diff == 0) {
                    return sum;
                }
                if (diff < min) {
                    min = diff;
                    result = sum;
                }
                if (sum <= b) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(-1);
        a.add(2);
        a.add(1);
        a.add(-4);
        System.out.println(threeSum(a, 1));
    
    }
}
