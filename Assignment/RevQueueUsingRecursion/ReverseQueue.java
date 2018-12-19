package Assignment.RevQueueUsingRecursion;

import Assignment.StackUsingQueue.DynamicQueue;

public class ReverseQueue {
    public static void main(String[] args) throws Exception {
        DynamicQueue q = new DynamicQueue();
        for (int i = 0; i < 5; i++) {
            q.enqueue(i);
        }
        q.display();
        reverseQueue(q);
        q.display();
    }

    public static void reverseQueue(DynamicQueue q) throws Exception {
        if (q.isEmpty()) {
            return;
        }
        int item= q.dequeue();
        reverseQueue(q);
        q.enqueue(item);

    }
}
