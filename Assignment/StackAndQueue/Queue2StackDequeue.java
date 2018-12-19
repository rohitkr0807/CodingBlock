package Assignment.StackAndQueue;

import StackQueue.DynamicStack;

public class Queue2StackDequeue {
    private DynamicStack sPrimary;
    private DynamicStack sSecondary;

    public Queue2StackDequeue() throws Exception {
        this.sPrimary = new DynamicStack();
        this.sSecondary = new DynamicStack();
    }

    public int size() {
        return this.sPrimary.size();
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void enqueue(int item) throws Exception {
        while (!this.sPrimary.isEmpty()) {
            this.sSecondary.push(this.sPrimary.pop());
        }
        this.sPrimary.push(item);
        while (!this.sSecondary.isEmpty()) {
            this.sPrimary.push(this.sSecondary.pop());
        }
    }

    public int dequeue() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        int rv = this.sPrimary.pop();
        return rv;
    }
    public int front() throws Exception {
        if(this.isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int rv= this.sPrimary.pop();
        return rv;
    }
    public void display() throws Exception{
        this.sPrimary.display();
    }
}
