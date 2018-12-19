package Revision;

import InterviewBit.LinkList;

import java.util.LinkedList;

public class Linklist {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static class LinkedList {
        Node head;
    }

    class GFG {
        int getMiddle(Node head) {
            Node current = head;
            Node fastPointer = head;
            if (head != null) {
                while (fastPointer != null && fastPointer.next != null) {
                    fastPointer = fastPointer.next;
                    current = current.next;
                }
            }
            return current.data;

        }
    }

    Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        Node fastpointer = head;
        if (current != null) {
            while (fastpointer != null && fastpointer.next != null) {
                fastpointer = fastpointer.next.next;
                current = current.next;
            }
        }
        return head;

    }

    void rotate(Node head, int k) {
        if (k == 0) {
            return;
        }
        int count = 1;
        Node current = head;
        while (count < k && current != null) {
            current = current.next;
            count++;
        }
        if (current == null) {
            return;
        }
        Node kthNode = current;
        while (current.next != null) {
            current = current.next;


        }
        current.next = head;
        head = kthNode.next;
        kthNode.next=null;
    }


}
