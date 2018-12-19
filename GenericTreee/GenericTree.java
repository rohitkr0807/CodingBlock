package GenericTreee;

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
        this.root = this.construct(scrn, null, 0);
    }

    private Node construct(Scanner scrn, Node parent, int ithChild) {
        if (parent == null) {
            System.out.println("Enter the data for root");
        } else {
            System.out.println("Enter the data for " + ithChild + " th child of " + parent.data);
        }
        int childData = scrn.nextInt();
        Node child = new Node(childData);
        this.size++;
        System.out.println("Enter the number of " + "children for " + childData);
        int numGC = scrn.nextInt();
        for (int i = 0; i < numGC; i++) {
            Node gc = this.construct(scrn, child, i);
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

    public void display() {
        this.display(this.root);
    }

    public void display(Node node) {
        System.out.print(node.data + "=>");
        for (Node child : node.children) {
            System.out.print(child.data + " ");
        }
        System.out.println("END");
        for (Node child : node.children) {
            this.display(child);
        }
    }

    public int size2() {
        return this.size2(root);
    }

    public int size2(Node node) {
        int rv = 0;
        for (Node child : node.children) {
            rv += size2(child);
        }
//        for (int i = 0; i <node.children.size() ; i++) {
//            rv+= size2(node.children.get(i));
//
//        }
        rv += 1;
        return rv;
    }

    public boolean find(int item) {
        return this.find(this.root, item);
    }

    private boolean find(Node node, int item) {
        if (node.data == item) {
            return true;
        }
        for (Node child : node.children) {
            boolean childResult = this.find(child, item);
            if (childResult) {
                return true;
            }
        }
        return false;
    }

    public int max() {
        return this.maxNode(this.root).data;
    }

    private Node maxNode(Node node) {
        Node rv = node;
        for (Node child : node.children) {
            Node childmax = maxNode(child);
            if (childmax.data > rv.data) {
                rv = childmax;
            }
        }


        return rv;
    }

    public int height() {
        return this.height(this.root);

    }

    private int height(Node node) {
        int rv = -1;
        for (Node child : node.children) {
            int childheight = this.height(child);
            if (childheight > rv) {
                rv = childheight;
            }
        }
        rv++;
        return rv;
    }

    public void mirror() {
        this.mirror(this.root);
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

    public boolean isIsomorphic(GenericTree other) {

        return this.isIsomorphic(this.root, other.root);
    }

    private boolean isIsomorphic(Node node, Node othernode) {
        if (node.children.size() != othernode.children.size()) {
            return false;
        } else {
            for (int i = 0; i < node.children.size(); i++) {
                boolean childResult = isIsomorphic(node.children.get(i), othernode.children.get(i));
                if (childResult == false) {
                    return false;
                }
            }
        }
        return false;
    }

    public void preorder() {
        this.preorder(this.root);
        System.out.println("END");

    }

    private void preorder(Node node) {
        System.out.print(node.data + ", ");
        for (Node child : node.children) {
            this.preorder(child);
        }
    }

    public void postOrder() {
        this.postOrder(this.root);

    }

    private void postOrder(Node node) {
        for (Node child : node.children) {
            this.postOrder(child);
        }
        System.out.print(node.data + " ");
        System.out.println();
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

    private int calculateScore(Node node) {
        int rv = 0;
        System.out.println("Hi" + node.data);
        rv += node.data;
        for (Node child : node.children) {
            rv += child.data;
        }
        return rv;
    }

    public int maxScore() {
        return 0;
    }

    private Node maxScore(Node node) {
        Node rv = node;
        for (Node child : node.children) {
            Node childmax = this.maxScore(child);
            int childMaxscore = this.calculateScore(childmax);
            int maxScore = this.calculateScore(rv);
            if (childMaxscore > maxScore) {
                rv = childmax;
            }
        }
        return rv;
    }

    private class MaxScorePair {
        Node node;
        int score;

        public MaxScorePair(Node node) {
            this.node = node;
            this.score = calculateScore(node);
        }
    }

    private MaxScorePair maxScoreBtr(Node node) {
        MaxScorePair rv = new MaxScorePair(node);
        for (Node child : node.children) {
            MaxScorePair childMaxPair = maxScoreBtr(child);
            if (childMaxPair.score > rv.score) {
                rv = childMaxPair;
            }
        }
        return rv;
    }

    public int maxScoreBtr() {
        MaxScorePair ans = this.maxScoreBtr(this.root);
        return ans.node.data;
    }

    public class Composite {
        int size;
        int max;
        int min;
    }

    private void multiSolver(Composite composite, Node node) {
        composite.size++;
        if (node.data > composite.max) {
            composite.max = node.data;
        }
        for (int i = 0; i < node.children.size(); i++) {
            multiSolver(composite, node.children.get(i));
        }
    }

    public void multiSolver() {
        Composite composite = new Composite();
        composite.size = 0;
        composite.max = Integer.MIN_VALUE;
        composite.min = Integer.MAX_VALUE;
        this.multiSolver(composite, this.root);
        System.out.println("Max is " + composite.max);
        System.out.println("Size is " + composite.size);
        System.out.println("Min is " + composite.min);
    }

    private void multiiSolver(Composite composite, Node node) {
        composite.size++;
        if (node.data < composite.min) {
            composite.min = node.data;
        }
        for (int i = 0; i < node.children.size(); i++) {
            multiSolver(composite, node.children.get(i));
        }
    }

    public void multiiSolver() {
        Composite composite = new Composite();
        composite.size = 0;
        composite.min = Integer.MAX_VALUE;
        this.multiiSolver(composite, this.root);
        System.out.println("MIN is " + composite.min);
    }

    public class PreOrder {
        boolean found;
        Node pred;
        Node succ;

    }

    private void preOrderTransversal(int item, PreOrder preOrder, Node node) {
        if (!preOrder.found) {
            if (node.data == item) {
                preOrder.found = true;
            } else {
                preOrder.pred = node;
            }
        } else {
            if (preOrder.succ == null) {
                preOrder.succ = node;
            }
        }
        for (int i = 0; i < node.children.size(); i++) {
            this.preOrderTransversal(item, preOrder, node.children.get(i));
        }
    }

    public int nextLarger(int item) {
        return 0;
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

}
