package Company;

import java.util.Stack;
import java.util.*;

public class SortAStack {
    public Stack<Integer> sort(Stack<Integer> stack) {
        if (stack == null || stack.isEmpty()) {
            return stack;
        }
        Stack<Integer> newStack= new Stack<>();
        newStack.push(stack.pop());
        while (!stack.isEmpty()){
            int temp= stack.pop();
            while (!newStack.isEmpty()&& temp>newStack.peek()){
                stack.push(newStack.pop());
            }
            newStack.push(temp);
        }
        return newStack;
    }


}
