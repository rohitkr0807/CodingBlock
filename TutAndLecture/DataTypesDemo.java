package TutAndLecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Stack;

public class DataTypesDemo {
    public static void main(String[] args) {
        byte by=10;
        System.out.println((Integer.toString(by)));
        System.out.println(by);
        Stack s= new Stack();
        s.add(4);
        s.add(2);
        Collections.sort(s);
        System.out.println(s);

        int in=10;
        long l=20;
        l=in;
        in=(int) l;
        short sh=10;
        sh=by;
        by=(byte)sh;
    }
}
