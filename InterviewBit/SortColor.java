package InterviewBit;

import java.util.ArrayList;
import java.util.Collections;

public class SortColor {
    public static void SortColor(ArrayList<Integer> a){
        Collections.sort(a);
        for (int i = 0; i <a.size() ; i++) {
            System.out.print(a.get(i)+" ");
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> a = new  ArrayList<Integer>();
//        a.add(1);
//        a.add(2);
//        a.add(0);
//        a.add(0);
//        a.add(2);
//        a.add(1);
//        a.add(2);
//        a.add(0);
        a.add(0);
        SortColor(a);
    }
}

