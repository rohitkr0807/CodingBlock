package Array;

import StackQueue.Stack;

import java.util.ArrayList;
import java.util.Scanner;

public class piDigit {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append("31415926535897932384626433832795028841971693993751");
        Scanner scrn = new Scanner(System.in);
        int t = scrn.nextInt();
        while (t > 0) {
            int n = scrn.nextInt();
            if (n > 0) {

                System.out.println(sb.charAt(n - 1));
                t--;
            }

        }
    }
}
