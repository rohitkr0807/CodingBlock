package InterviewBit;

import ProgrammingSkills.LinkedList;

import javax.xml.soap.Node;

public class LinkList {
    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    private int size;
    private ListNode head;
    private ListNode tail;

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public class Solution {
        public int isPalindrome(ListNode A) {

            ListNode current = A;
            ListNode mid = A;
            ListNode prev=null;
            ListNode newCurr=null;
            ListNode newTemp;
            ListNode newPrev=null;
            while (current == null) {
                return 1;
            }
            if (current.next == null) {
                return 1;
            }
            while ((current != null) && current.next.next != null) {
                current = current.next.next;
                prev = mid;
                mid = mid.next;
            }
            prev.next = null;
            newCurr = mid;
            while (newCurr != null) {
                newTemp = newCurr.next;
                if(newCurr == mid){
                    newCurr.next = null;
                    newPrev = newCurr;
                    newCurr = newTemp;
                }
                else{
                    newCurr.next = newPrev;
                    newPrev = newCurr;
                    newCurr = newTemp;
                }
            }
            current= A;

            while((newPrev != null) && (current != null)){
                if(newPrev.val != current.val){
                    return 0;
                }
                newPrev = newPrev.next;
                current = current.next;
            }
            return 1;

        }
    }

    public int getLast() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Empty");
        }
        return this.tail.val;
    }

    public void addFirst(int item) {
        ListNode newHead = new ListNode(item);

        if (this.isEmpty()) {
            this.tail = newHead;
        }

        this.head = newHead;

        this.size++;
    }

}
