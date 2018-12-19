package Assignment;

import StackQueue.DynamicStack;

public class CheckBalance  {
    public static void main(String[] args) throws Exception {
        System.out.println(isBalanced("{{[[(())]]}}"));

    }

    public static boolean isBalanced(String str) throws Exception {
        DynamicStack stack = new DynamicStack();
        for (int i = 0; i < str.length(); i++) {
            char cc = str.charAt(i);
            if (cc == '(' || cc == '{' || cc == '[') {
                stack.push(cc);
            } else if (cc == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char tc = (char) stack.pop();
                if (tc == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (cc == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char tc = (char) stack.pop();
                if (tc == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (cc == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char tc = (char) stack.pop();
                if (tc == '[') {
                    stack.pop();
                } else {
                    return false;
                }

            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
}
