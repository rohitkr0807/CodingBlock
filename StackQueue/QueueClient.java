package StackQueue;

public class QueueClient {
    public static void main(String[] args) throws Exception {
        Queue q = new Queue(4);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(3);
        q.enqueue(7);

        q.display();
        System.out.println(q.dequeue());
        q.display();
        System.out.println(q.size);
    }
}
