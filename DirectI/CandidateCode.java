package DirectI;
import java.util.*;

public class CandidateCode {
    public class Node {
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

    public Node insert(int item) {
        Node newHead = new Node(item, this.head);
        if(head==null){
            head=newHead;
        }else{
            Node runner=this.head;
            while (runner.next!=null){
                runner=runner.next;
                runner.next=newHead;
            }
        }
        size++;
        return head;
    }
    public int size(){
        return this.size;
    }

    public void display() {
        Node tobePrinted = this.head;
        while (this.head!=null){
            System.out.println(this.head.data);
            this.head=this.head.next;
        }
    }

    public static void main(String args[]) {
        CandidateCode c = new CandidateCode();
        Node head=null;
        Scanner scrn = new Scanner(System.in);
        while (scrn.hasNext()) {
            int n = scrn.nextInt();
            head=c.insert(n);
        }
        c.display();

    }


}
