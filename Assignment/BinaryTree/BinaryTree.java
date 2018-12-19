package Assignment.BinaryTree;

import java.util.Scanner;

public class BinaryTree {
    private class Node {
        Node left;
        Node right;
        int data;

        public Node(Node left, Node right, int data) {
            this.left = left;
            this.right = right;
            this.data = data;

        }
    }

    private Node root;
    private int size;

    public BinaryTree() {
        Scanner scrn = new Scanner(System.in);
        this.root = this.construct(scrn, null, false);

    }

    private Node construct(Scanner scrn, Node parent, boolean isLeft) {
        if (parent == null) {
            System.out.println("Enter the data for root");
        } else {
            if (isLeft) {
                System.out.println("Enter the data for left child of " + parent.data);
            } else {
                System.out.println("Enter the data for right child of " + parent.data);
            }
        }
        int childData = scrn.nextInt();
        Node child = new Node(null, null, childData);
        this.size++;
        System.out.println("Do you have a left child ? " + child.data);
        boolean choice = scrn.nextBoolean();
        if (choice) {
            child.left = this.construct(scrn, child, true);
        }
        System.out.println("Do you have a right child ?" + child.data);
        choice = scrn.nextBoolean();
        if (choice) {
            child.right = this.construct(scrn, child, false);
        }

        return child;

    }
    public void display(){
        this.display(this.root);
    }
    private void display(Node node){
        if(node==null){
            return;
        }
        if(node.left==null){
            System.out.print("END => ");
        }else{
            System.out.print(node.left.data+ " => ");
        }
        System.out.print(node.data);
        if(node.right==null){
            System.out.print(" <= END ");
        }else{
            System.out.print("<= "+ node.right.data);
        }
        System.out.println();
        this.display(node.left);
        this.display(node.right);
    }
    private int min(Node node){
        if(node==null){
            return Integer.MAX_VALUE;
        }
        int lmin= this.min(node.left);
        int rmin= this.min(node.right);
        return Math.min(node.data, Math.min(lmin,rmin));
    }
    public int min(){
        return min(this.root);
    }
}
