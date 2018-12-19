package Geek4geek;

import java.util.*;

public class CommonSequence {
    public static void main(String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int c = 0, t = 0;


            String test1 = sc.next();
            String test2 = sc.next();
            String temp = test1;
            if (test1.length() > test2.length()) {
                t = test1.length();
                test1 = test2;
                test2 = temp;

            } else
                t = test2.length();
            for (int j = 0; j < t; j++) {

                if (test2.contains(Character.toString(test1.charAt(j)))) {
                    c++;
                }
            }
            if (c > 0)
                System.out.println("1");
            else
                System.out.println("0");
        }

    }


}