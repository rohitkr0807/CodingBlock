package DataStructure.BinaryTree;

import java.util.Scanner;

public class BinaryTreeTut {
    private class Node {
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private Node root;
    private int size;

    public BinaryTreeTut() {
        Scanner scrn = new Scanner(System.in);
        this.root = this.construct(scrn, null, false);
    }

    public BinaryTreeTut(int pre[], int in[]) {

    }

    private Node construct(int[] pre, int psi, int pli, int[] in, int isi, int ili) {
        return null;
    }

    private Node construct(Scanner scrn, Node parent, boolean isLeft) {
        if (parent == null) {
            System.out.println("Enter the data for root");
        } else {
            if (isLeft) {
                System.out.println("Enter the data for" + "left child of " + parent.data);
            } else {
                System.out.println("Enter the data for " + "right child of " + parent.data);
            }
        }
        int childData = scrn.nextInt();
        Node child = new Node(childData, null, null);
        this.size++;
        System.out.println("Do you have a left child ?" + child.data);
        boolean choice = scrn.nextBoolean();
        if (choice) {
            child.left = this.construct(scrn, child, true);
        }
        System.out.println("Do you have a right child ? " + child.data);
        choice = scrn.nextBoolean();
        if (choice) {
            child.right = this.construct(scrn, child, false);
        }
        return child;
    }

}
