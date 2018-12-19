package HackerRank;

import java.util.Scanner;
import java.util.Stack;

public class MaxElementStack {
    static String isBalanced(String str) {
        int lenght=str.length();
        if(lenght==0 || str==null){
            return "YES";
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (str.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (str.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }else{
                return "NO";
            }

        }
        return "YES";


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}