package Assignment.StackUsingQueue;

public class PopEfficientSUQ {
    DynamicQueue qPrimary;
    DynamicQueue qSecondary;

    public PopEfficientSUQ() throws Exception {
        this.qPrimary = new DynamicQueue();
        this.qSecondary = new DynamicQueue();
    }

    public int size() {
        return this.qPrimary.size();
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void push(int item) throws Exception {
        while (!this.qPrimary.isEmpty()) {
            this.qSecondary.enqueue(this.qPrimary.dequeue());

        }
        this.qPrimary.enqueue(item);
        while (!this.qSecondary.isEmpty()) {
            this.qPrimary.enqueue(this.qSecondary.dequeue());
        }
    }

    public int pop() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        return this.qPrimary.dequeue();
    }

}
