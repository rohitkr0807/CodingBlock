package Company;

public class InsertionOfNode {
    /*
    Given a sorted linked list and a value to insert, write a function to insert the value in sorted way.
     */
    Node head;

    public class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = null;
        }

        public void sortedInsert(Node newNode) {
            Node current;
            if (head == null || head.data >= newNode.data) {
                newNode.next = head;
                head = newNode;

            }else{
                current=head;
                while (current.next!=null && current.next.data<newNode.data){
                    current=current.next;
                    newNode.next=current.next;
                    current.next=newNode;
                }
            }
        }
    }
}
