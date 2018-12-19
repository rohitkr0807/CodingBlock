package Assignment.StackUsingQueue;

public class PushEffiicientSUQ {
    DynamicQueue qPrimary;
    DynamicQueue qSeconadary;

    public PushEffiicientSUQ() throws Exception {
        this.qPrimary = new DynamicQueue();
        this.qSeconadary = new DynamicQueue();
    }

    public int size() {
        return this.qPrimary.size();
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void push(int item) throws Exception {
        this.qPrimary.enqueue(item);
    }

    public int pop() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        int retVal = this.qPrimary.dequeue();
        while (this.qPrimary.size() != 1) {

            int data = this.qPrimary.dequeue();
            this.qSeconadary.enqueue(data);
        }
        return retVal;
    }

    public int top() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        while (this.qPrimary.size() != 1) {
            int data = this.qPrimary.dequeue();
            this.qSeconadary.enqueue(data);
        }
        int retVal = this.qPrimary.dequeue();
        this.qSeconadary.enqueue(retVal);
        while (!this.qSeconadary.isEmpty()) {
            this.qPrimary.enqueue(this.qSeconadary.dequeue());
        }
        return retVal;
    }
    public void display() throws Exception{
        reverse(this.qPrimary);
        this.qPrimary.display();
        reverse(this.qPrimary);
    }
    public static void reverse(DynamicQueue queue) throws Exception{
        if(queue.isEmpty()){
            return;
        }
        int item= queue.dequeue();
        reverse(queue);
        queue.enqueue(item);
    }

}
