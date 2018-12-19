package DataStructure.Generic;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {
    private class Node {
        int data;
        ArrayList<Node> children;

        public Node(int data) {
            this.data = data;
            this.children = new ArrayList<>();
        }
    }

    private Node root;
    private int size;

    public GenericTree() {
        Scanner scrn = new Scanner(System.in);
        this.root = this.takeInput(scrn, null, -1);

    }

    private Node takeInput(Scanner scrn, Node parentNode, int ithChild) {
        if (parentNode == null) {
            System.out.println("Enter the data for root Node");
        } else {
            System.out.println("Enter the data for " + ithChild + "th child of " + parentNode.data);
        }
        int childData = scrn.nextInt();
        System.out.println("Enter the number of children for " + childData);
        int numGrandChildren = scrn.nextInt();
        Node child = new Node(childData);
        this.size++;
        for (int i = 0; i < numGrandChildren; i++) {
            Node grandchild = this.takeInput(scrn, child, i + 1);
            child.children.add(grandchild);
        }

        return child;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void display() {
        System.out.println(this);
    }

    private int max(Node node) {
        int max = node.data;
        for (int i = 0; i < node.children.size(); i++) {
            int childMax = this.max(node.children.get(i));
            if (childMax > max) {
                max = childMax;
            }
        }
        return max;
    }

    @Override
    public String toString() {
        return this.toString(this.root);
    }

    private String toString(Node node) {
        String retVal = " ";
        retVal += node.data + "=>";
        for (int i = 0; i < node.children.size(); i++) {
            retVal += node.children.get(i).data + " ";
        }
        retVal += "END\n";
        for (int i = 0; i < node.children.size(); i++) {
            retVal += this.toString(node.children.get(i));
        }
        return retVal;
    }

    //Q1
    public int sum() {
        return this.sum(this.root);
    }

    private int sum(Node node) {
        int retVal = node.data;
        for (int i = 0; i < node.children.size(); i++) {
            retVal += sum(node.children.get(i));
        }
        return retVal;
    }
//    Q2

    public boolean StructurallyIdentical(GenericTree tree) {
        return this.StructurallyIdentical(this.root, tree.root);
    }

    private boolean StructurallyIdentical(Node root, Node troot) {
        if (root.children.size() != troot.children.size()) {
            return false;
        }
        for (int i = 0; i < troot.children.size(); i++) {
            if (!StructurallyIdentical(root.children.get(i), troot.children.get(i))) {
                return false;
            }
        }
        return true;
    }

    //    Q6
    public void replaceWithDepth() {
        this.replaceWithDepth(this.root, 0);
    }

    private void replaceWithDepth(Node root, int depth) {
        root.data = depth;
        for (int i = 0; i < root.children.size(); i++) {
            replaceWithDepth(root.children.get(i), depth + 1);
        }
    }
}
