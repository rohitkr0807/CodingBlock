package DirectI;

public class QueueClient {
    public static void main(String args[]) throws Exception{
        Queue q= new Queue();
        q.enqueue(23);
        q.enqueue(12);
        q.enqueue(13);
        System.out.println(q.size);
        q.display();
        System.out.println(q.front());
        q.dequeue();

        System.out.println(q.dequeue());
        q.display();
    }
}
