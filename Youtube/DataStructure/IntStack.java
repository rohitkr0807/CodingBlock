package Youtube.DataStructure;

public class IntStack {
    private int[] stack;
    private int top;
    private int size;

    public IntStack() {
        top = -1;
        size = 50;
        stack = new int[50];
    }

    public IntStack(int size) {
        top = -1;
        this.size = size;
        stack = new int[size];
    }

    public boolean push(int item) throws Exception {
        if(isFull()){
            throw new Exception("Stack is full");
        }
        top++;
        return stack[top] == item;
    }

    public boolean isFull() {
        return (top == stack.length - 1);
    }
    public int pop(){
        return stack[top--];
    }

}
