package DirectI;

public class LinkedList {
    private class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private int size;
    private Node head;
    private Node tail;

    public String toString() {
        String rv = "";
        Node temp = this.head;
        while (temp != null) {
            rv += temp.data + " ";
            temp = temp.next;
        }
        rv += "END\n";
        return rv;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void display() {
        Node tobePrinted = this.head;
        for (int i = 0; i < this.size(); i++) {
            System.out.print(tobePrinted.data + " ");
            tobePrinted = tobePrinted.next;
        }
        System.out.println("END SIZE: " + this.size);
    }

    public void addFirst(int item) {
        Node newHead = new Node(item, this.head);
        if (this.size() == 0) {
            this.tail = newHead;
        }
        this.head = newHead;
        this.size++;

    }
    public void addLast(int item){
        Node newHead= new Node(item,this.head);
        if(this.isEmpty()){
            this.tail=newHead;
        }
        Node newTail= new Node(item,null);
        this.tail.next=newTail;
        this.tail= newTail;
        this.size++;
    }
    public void addAt(int idx,int item) throws Exception{
        if(idx<0||idx>this.size()){
            throw new Exception("Invalid Index");
        }
        if(idx==0){
            addFirst(item);
        }else if(idx==this.size()){
            addLast(item);
        }else{

        }
    }
}
