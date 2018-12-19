package TutorialLinklist;

public class LinkedListTut {
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

    @Override
    public String toString() {
        String rv = "";
        Node temp = this.head;
        while (temp != null) {
            rv += temp.data + " ,";
            temp = temp.next;

        }
        rv += "End\n";


        return rv;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void display() {
        Node nodeTobePrinted = this.head;
        for (int i = 0; i < this.size(); i++) {
            System.out.print(nodeTobePrinted.data + " =>");
            nodeTobePrinted = nodeTobePrinted.next;
        }
        System.out.println("END size:" + this.size());
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
        }
        Node newTail = new Node(item, null);
        this.tail.next = newTail;
        this.tail = newTail;
        this.size++;
    }

    public void addAt(int idx, int item) throws Exception {
        if (idx < 0 || idx > this.size()) {
            throw new Exception("Index out of bound");
        }

        if (idx == 0) {
            this.addFirst(item);
        } else if (idx == this.size()) {
            this.addLast(item);
        } else {

            Node nm1 = this.getNodeAt(idx - 1);
            Node np1 = nm1.next;

            Node newNode = new Node(item, np1);
            nm1.next = newNode;

            this.size++;

        }
    }

    private Node getNodeAt(int idx) throws Exception {
        if (idx < 0 || idx >= this.size()) {
            throw new Exception("Index out of bound");
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
        if(this.isEmpty()){
            throw new Exception("List is Empty");

        }
        int retVal= this.head.data;
        if(this.size()==1){
            this.head=null;
            this.tail=null;
        }else{
            this.head=this.head.next;
        }
        this.size--;
        return retVal;
    }

    public void swapNodes(int num1, int num2) {
        if (num1 == num2) {
            return;
        }
        Node prev1 = null, curr1 = head;
        while (curr1 != null && curr1.data != num1) {
            prev1 = curr1;
            curr1 = curr1.next;
        }
        Node prev2 = null, curr2 = head;
        while (curr2 != null && curr2.data != num2) {
            prev2 = curr2;
            curr2 = curr2.next;
        }
        if (curr1 == null || curr2 == null) {
            return;
        }
        if (prev1 != null) {
            prev1.next = curr2;

        } else {
            head = curr2;
        }
        if (prev2 != null) {
            prev2.next = curr1;
        } else {
            head = curr1;
        }
        Node temp = curr1.next;
        curr1.next = curr2.next;
        curr2.next = temp;
        if (curr1.next == null) {
            this.tail = curr1;
        }
        if (curr2.next == null) {
            this.tail = curr2;
        }
    }

    public void eliminateDuplicates() {
        Node prev = this.head;
        Node curr = prev.next;
        while (curr != null) {
            if (prev.data == curr.data) {
                prev.next = curr.next;
                this.size--;
                curr = curr.next;
            } else {
                prev = prev.next;
                curr = curr.next;
            }
        }
        this.tail = prev;
        this.tail.next = null;
    }

    public LinkedListTut merge(LinkedListTut other) {
        LinkedListTut retval = new LinkedListTut();
        Node thisTemp = this.head, othertemp = other.head;
        while (thisTemp != null && othertemp != null) {
            if (thisTemp.data < othertemp.data) {
                retval.addLast(thisTemp.data);
                thisTemp = thisTemp.next;
            } else {
                retval.addLast(othertemp.data);
                othertemp = othertemp.next;
            }
        }
        while (thisTemp != null) {
            retval.addLast(thisTemp.data);
            thisTemp = thisTemp.next;
        }

        while (othertemp != null) {
            retval.addLast(othertemp.data);
            othertemp = othertemp.next;
        }
        return retval;
    }

    public int mid() {
        return this.midNode().data;
    }

    private Node midNode() {
        Node slow = this.head;
        Node fast = this.head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public void Kreverse(int k) throws Exception {
        LinkedListTut current= new LinkedListTut(), prev=null;
        while (!this.isEmpty()){
            for (int i=0; !this.isEmpty() && i<k; i++){
                current.addFirst(this.removeFirst());
            }
            if(prev==null){
                prev=current;
            }else{
                prev.tail.next= current.head;
                prev.tail=current.tail;
                prev.size+= current.size;

            }
            current= new LinkedListTut();
        }
        this.head= prev.head;
        this.tail= prev.tail;
        this.size= prev.size;

    }

}
