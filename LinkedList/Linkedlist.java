package LinkedList;

public class Linkedlist {
    private class Node {
        Node next;
        int data;

        public Node(int data, Node next) {
            this.next = next;
            this.data = data;
        }
    }

    private int size;
    private Node head;
    private Node tail;

    public String toString() {
        String rv = " ";
        Node temp = this.head;
        while (temp != null) {
            rv += temp.data + " ,";
            temp = temp.next;

        }


        return rv;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void display() {
        Node tobeprinted = this.head;
        for (int i = 0; i < this.size(); i++) {
            System.out.print(tobeprinted.data + " => ");
            tobeprinted = tobeprinted.next;

        }
        System.out.println("END Size :" + this.size());
    }

    public void addFirst(int item) {
        Node newHead = new Node(item, this.head);
        if (this.isEmpty()) {
            this.tail = newHead;

        }
        this.head = newHead;
        this.size++;

    }

    public void addLast(int item) {
        if (this.isEmpty()) {
            this.addFirst(item);
        } else {
            Node newTail = new Node(item, this.tail);
            this.tail.next = newTail;
            this.tail = newTail;
            this.size++;
        }
    }

    public void addAt(int idx, int item) throws Exception

    {
        if (idx < 0 || idx > this.size()) {
            throw new Exception("Invalid Index");
        }
        if (idx == 0) {
            addFirst(item);
        } else if (idx == this.size()) {
            addLast(item);
        } else {
            Node nm1 = this.getNodeAt(idx - 1);
            Node np1 = nm1.next;
            Node newNode = new Node(item, np1);
            nm1.next = newNode;
            this.size++;
        }
    }

    public int getFirst() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is Empty");
        }
        return this.head.data;
    }

    public int getLast() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is Empty");
        }
        return this.tail.data;
    }

    public int getAt(int item) throws Exception {
        return this.getNodeAt(item).data;
    }

    private Node getNodeAt(int idx) throws Exception {
        if (idx < 0 || idx > this.size()) {
            throw new Exception("Kuch bhi");

        }
        if (idx == 0) {
            return this.head;
        }
        if (idx == this.size() - 1) {
            return this.tail;
        }
        Node rv = this.head;
        for (int i = 0; i < idx; i++) {
            rv = rv.next;
        }
        return rv;
    }

    public int removeFirst() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Kuch v krega");
        }
        int rv = this.head.data;
        this.head = this.head.next;
        if (this.size() == 1) {
            this.tail = null;
        }
        this.size--;
        return rv;
    }

    public int removeLast() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("List is Empty");
        }
        int rv = this.tail.data;
        if (this.size() == 1) {
            this.head = this.tail = null;
        } else {
            Node sm2 = this.getNodeAt(this.size() - 2);
            sm2.next = null;
            this.tail = sm2;
        }
        this.size--;
        return rv;
    }

    public int removeAt(int idx) throws Exception {
        if (idx < 0 || idx >= this.size()) {
            throw new Exception("Index out of bound");
        }
        if (idx == 0) {
            return this.removeFirst();
        } else if (idx == this.size() - 1) {
            return this.removeLast();
        } else {
            Node nm1 = this.getNodeAt(idx - 1);
            Node n = nm1.next;
            Node np1 = n.next;
            nm1.next = np1;
            this.size--;
            return n.data;
        }
    }

    public int LinearSearch(int item) {
        Node toBechecked = this.head;
        for (int i = 0; i < this.size(); i++) {
            if (toBechecked.data == item) {
                return i;
            }
            toBechecked = toBechecked.next;
        }
        return -1;
    }
}
