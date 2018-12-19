package StackQueue;

public class StackClient {
    public static void main(String[] args) throws Exception {
        Stack stack= new Stack(5);
        stack.push(23);
        stack.push(23);
        stack.push(23);
        stack.push(23);
        stack.display();
        stack.pop();
        stack.display();
        stack.top();
        stack.top();
        stack.pop();
        System.out.println(stack.pop());
        stack.display();
        System.out.println(stack.top());
        DynamicStack s= new DynamicStack();
        s.push(34);
        s.display();
        s.push(35);
        s.push(36);
        s.push(35);
        s.push(36);
        s.push(35);
        s.push(36);
        s.push(35);
        s.push(36);
        s.push(35);
        s.push(36);
        s.push(35);
        s.push(36);
        s.push(35);
        s.push(36); s.push(35);
        s.push(36);
        s.push(35);
        s.push(36);
        s.push(35);
        s.push(36);
        s.display();
        System.out.println(s.top());

    }
}
