package Assignment.StackAndQueue;

public class Client {
    public static void main(String[] args) throws Exception {
        Queue2StackDequeue queue= new Queue2StackDequeue();
        for (int i = 0; i <5 ; i++) {
            queue.enqueue(i);
            displayQueueStats(queue);

        }
        while(!queue.isEmpty()){
            System.out.println(queue.front());
            System.out.println(queue.dequeue());
            displayQueueStats(queue);
        }


        // Part - Show Exception
//		queue.dequeue();

        System.out.println("Thanks for using");
    }

    public static void displayQueueStats(Queue2StackDequeue queue) throws Exception{
        System.out.println("*****************************************");
        queue.display();
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println("*****************************************");
    }

}
