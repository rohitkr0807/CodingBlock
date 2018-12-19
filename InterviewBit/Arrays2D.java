package InterviewBit;

import Array.Array;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arrays2D {
    ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A){
        ArrayList<ArrayList<Integer>> B= new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <A.size() ; i++) {
            B.add(new ArrayList<Integer>());
            for (int j = 0; j <A.get(i).size() ; j++) {
                B.get(i).add(0);
            }
            for (int j = 0; j <A.get(i).size() ; j++) {
                B.get(i).set(A.get(i).size()-1-j, A.get(i).get(j));
            }
        }

        return B;


    }
    public static int isPalindrome(LinkedList A){
        return 0;
    }


}
