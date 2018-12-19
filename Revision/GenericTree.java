package Revision;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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
    }

    private Node Construct(Scanner scrn, Node parent, int ithchild) {
        if (parent == null) {
            System.out.println("Enter the data for root");
        } else {
            System.out.println("Enter the data for " + ithchild + "th child of " + parent.data);
        }
        int childData = scrn.nextInt();
        Node child = new Node(childData);
        this.size++;
        System.out.println("ENter the number of children for " + childData);
        int numGC = scrn.nextInt();
        for (int i = 0; i < numGC; i++) {
            Node gc = this.Construct(scrn, child, i);
            child.children.add(gc);
        }
        return child;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    private void display(Node node) {
        System.out.print(node.data + "=>");
        for (Node child : node.children) {
            System.out.print(child.data + " , ");
        }
        System.out.println("END");
        for (Node child : node.children) {
            this.display(child);
        }
    }

    public void display() {
        this.display(this.root);
    }

    private int size2(Node node) {
        int rv = 0;
        for (Node child : node.children) {
            rv += size2(child);
        }
        rv += 1;
        return rv;
    }

    public boolean find(int item, Node node) {
        if (node.data == item) {
            return true;
        }
        for (Node child : node.children) {
            boolean childResult = this.find(item, child);
            if (childResult) {
                return true;
            }
        }
        return false;
    }

    public int max(Node node) {
        Node rv = node;
        for (Node child : node.children) {
            int childMax = max(child);
            if (childMax > rv.data) {
                rv.data = childMax;
            }
        }


        return rv.data;
    }

    public int height(Node node) {
        int rv = -1;
        for (Node child : node.children) {
            int childHeight = this.height(child);
            if (childHeight > rv) {
                rv = childHeight;
            }
        }
        rv++;
        return rv;
    }

    private void mirror(Node node) {
        int left = 0;
        int right = node.children.size() - 1;
        while (left <= right) {
            Node temp = node.children.get(left);
            node.children.set(left, node.children.get(right));
            node.children.set(right, temp);

            left++;
            right--;
        }
        for (Node child : node.children) {
            this.mirror(child);
        }
    }

    public boolean isIsomorphic(Node node, Node otherNode) {
        if (node.children.size() != otherNode.children.size()) {
            return false;
        } else {
            for (int i = 0; i < node.children.size(); i++) {
                boolean childResult = isIsomorphic(node.children.get(i), otherNode.children.get(i));
                if (childResult == false) {
                    return false;
                }
            }
        }
        return true;
    }

    public void preOrder(Node node) {
        System.out.print(node.data + " ,");
        for (Node child : node.children) {
            this.preOrder(child);
        }
    }

    public void postOrder(Node node) {
        for (int i = 0; i < node.children.size(); i++) {
            Node child = node.children.get(i);
            postOrder(child);
        }
        System.out.println(node.data + " ");
    }

    public void levelOrder() {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(this.root);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.print(temp.data + " ");
            for (Node child : temp.children) {
                queue.offer(child);
            }
        }
        System.out.println("END");
    }

    public int calculateScore(Node node) {
        System.out.print("Hi" + node.data);
        int rv = 0;
        rv = rv + node.data;
        for (Node child : node.children) {
            rv += child.data;
        }
        return rv;
    }

    public int maxScore() {
        return maxScoreNode(root).data;
    }

    private Node maxScoreNode(Node node) {
        Node rv = node;
        for (Node child : node.children) {
            Node childMax = this.maxScoreNode(child);
            int maxScore = this.calculateScore(rv);
            int childMaxScore = this.calculateScore(child);
            if (childMaxScore > maxScore) {
                rv = childMax;
            }
        }
        return rv;
    }

    private Node nextLarger(int item, Node node) {
        Node rv = null;
        if (node.data > item) {
            rv = node;
        }
        for (Node child : node.children) {
            Node childAns = nextLarger(item, child);
            if (childAns != null) {
                if (rv == null) {
                    rv = childAns;
                } else {
                    if (childAns.data < rv.data) {
                        rv = childAns;
                    }
                }
            }
        }
        return rv;
    }

    public int NextLarger(int item) {
        return this.nextLarger(item, root).data;
    }
    public void replaceWD(){
        replaceW(0,this.root);
    }
    private void replaceW(int level, Node node){
        node.data=level;
        for(Node child: node.children){
            replaceW(level+1,child);
        }
    }
}


