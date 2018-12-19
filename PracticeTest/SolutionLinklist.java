package PracticeTest;

import java.util.Scanner;

public class SolutionLinklist {
    public class Node{
        Node next;
        int data;
        public Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    public Node insert(int data, Node head){
        Node newNode= new Node(data);
        if(head==null){
            head= newNode;
        }else{
            Node node= head;
            while (node.next!=null){
                node= node.next;
                node.next=newNode;
            }
        }
        return head;


    }
    public void answer(Node node){
        while (node.next!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
    }

    public static void main(String[] args) {
        SolutionLinklist sl= new SolutionLinklist();
        Scanner scrn= new Scanner(System.in);
        while (scrn.hasNext()){
            int d= scrn.nextInt();

        }
    }
}
