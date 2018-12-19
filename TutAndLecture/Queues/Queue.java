package TutAndLecture.Queues;

public class Queue {
    protected int data[];
    protected int front;
    protected int size;
    public static final int DefaultCapacity = 10;

    public Queue() {
        this(DefaultCapacity);
    }

    public Queue(int capacity) {
        this.data = new int[capacity];
        this.front = 0;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }
    public void display(){
        for (int i = 0; i <this.size() ; i++) {
            System.out.print(this.data[(i+front)%this.data.length]+",");
        }
        System.out.println("END");
    }
}
