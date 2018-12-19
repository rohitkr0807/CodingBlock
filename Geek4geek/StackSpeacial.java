package Geek4geek;

import java.util.Stack;

public class StackSpeacial extends Stack {
    Stack<Integer> s = new Stack<>();

    public void push(int a, Stack<Integer> s) {
        if (isEmpty() == true) {
            super.push(a);
            s.push(a);
        } else {
            super.push(a);
            int b = s.pop();
            if (a < b) {
                s.push(a);
            } else {
                s.push(b);
            }

        }

    }

    public int pop(Stack<Integer> s) {
        int x= (int) super.pop();
        s.pop();
        return x;

        //add code here.
    }

    public int min(Stack<Integer> s) {
        int x= s.pop();
        s.push(x);
        return x;
        //add code here.
    }

    public boolean isFull(Stack<Integer> s, int n) {
        return false;
        //add code here.
    }

    public boolean isEmpty(Stack<Integer> s) {
        return false;
        //add code here.
    }

    public static void main(String[] args) {
        StackSpeacial st= new StackSpeacial();
        st.push(10);
        st.push(13);
        System.out.println(st);
    }
}

