package Array;

import java.util.*;

public class ArrayListDemos {
    public static int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int numSteps = 0;
        for (int i = 1; i < X.size(); i++) {
            numSteps += Math.max(Math.abs(X.get(i) - X.get(i - 1)), Math.abs(Y.get(i) - Y.get(i - 1)));
        }
        return numSteps;
    }

//    public static void main(String[] args) {
//        ArrayList<Integer> x = new ArrayList<>(5);
//        ArrayList y = new ArrayList(5);
//        for (int i = 0; i < x.size(); i++) {
//            x.add(i);
//        }
//        for (int i = 0; i < y.size(); i++) {
//            y.add(i);
//        }
//        System.out.println(coverPoints(x, y));
//    }

    ArrayList<Integer> performOps(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<Integer>();
        for (int i = 0; i < 2 * A.size(); i++) B.add(0);
        for (int i = 0; i < A.size(); i++) {
            B.set(i, A.get(i));
            B.set(i + A.size(), A.get((A.size() - i) % A.size()));
        }
        return B;
    }



}
