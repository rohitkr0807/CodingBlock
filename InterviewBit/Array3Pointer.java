package InterviewBit;

import java.util.*;

public class Array3Pointer {
    public static int minimize(final List<Integer> a, final List<Integer> b, final List<Integer> c) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                for (int k = 0; k < c.size(); k++) {
                    int max1 = Math.max(Math.abs(a.get(i) - b.get(j)), Math.abs(b.get(j) - c.get(k)));
                    int max2 = Math.max(max1, Math.abs(c.get(k) - a.get(i)));
                    if (max2 < result) {
                        result = max2;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        List<Integer> b = new ArrayList<Integer>();
        b.add(4);
        b.add(5);
        b.add(6);
        List<Integer> c = new ArrayList<Integer>();
        c.add(7);
        c.add(8);
        c.add(9);
        System.out.println(minimize(a,b,c));

    }
}

