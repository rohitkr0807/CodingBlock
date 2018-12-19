package InterviewBit;

import java.util.*;

public class LenghtNLessthanK {

    //    Given a set of digits (A) in sorted order, find how many numbers of length B are possible whose value is less than number C.
    public static void main(String[] args) {

    }

    public static int solve(ArrayList<Integer> A, int B, int C) {
        Collections.sort(A);
        ArrayList al= new ArrayList();
        for (int i = 0; i <A.size() ; i++) {
            al.add(A.get(i));
        }
        return 0;
    }

}
