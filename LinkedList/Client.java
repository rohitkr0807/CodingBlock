package LinkedList;

public class Client {
    public static void main(String[] args) throws Exception {
        Linkedlist ll= new Linkedlist();
        ll.addFirst(23);
        ll.addFirst(24);
        ll.display();
        System.out.println(ll.removeAt(4));
    }
}
