package Assignment.MinSTack;

import StackQueue.DynamicStack;

public class MinStack {
    private DynamicStack primaryStack;
    private DynamicStack minStack;

    public MinStack() throws Exception {
        this.primaryStack = new DynamicStack();
        this.minStack = new DynamicStack();
    }

    public void push(int item) throws Exception {
        if (primaryStack.isEmpty()) {
            primaryStack.push(item);
            minStack.push(item);
        } else {
            primaryStack.push(item);
            if (minStack.top() > item) {
                minStack.push(item);
            }
        }
    }

    public int pop() throws Exception {
        int retVal = primaryStack.pop();
        if (minStack.pop() == retVal) {
            minStack.pop();
        }
        return retVal;
    }
    public int getMinimum() throws Exception{
        return minStack.top();
    }
    public void display() throws Exception{
        primaryStack.display();
        System.out.println();
    }
    public boolean isEmpty(){
        return primaryStack.isEmpty();
    }

}
