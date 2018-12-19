package Tutorial;


public class BTandBST {                   //Creating BST
    private class Node {
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.left = left;
            this.right = right;
            this.data = data;
        }
    }

    private int size;
    private Node root;

    public BTandBST(int... sa) {
        this.root = this.construct(sa, 0, sa.length - 1);

    }

    private Node construct(int[] sa, int si, int li) {
        if (si > li) {
            return null;
        }
        int mid = (si + li) / 2;
        Node node = new Node(sa[mid], null, null);
        this.size++;
        node.left = this.construct(sa, si, mid - 1);
        node.right = this.construct(sa, mid + 1, li);
        return node;
    }

    public BTandBST() {

    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void add(int item) {
        if (this.isEmpty()) {
            this.root = new Node(item, null, null);
            this.size++;
        } else {
            this.add(item, this.root);
        }
    }

    private void add(int item, Node node) {
        if (item > node.data) {
            if (node.right == null) {
                node.right = new Node(item, null, null);
                this.size++;
            } else {
                this.add(item, node.right);
            }
        } else if (item < node.data) {
            if (node.left == null) {
                node.left = new Node(item, null, null);
                this.size++;
            } else {
                this.add(item, node.left);
            }
        } else {
            //nothing
        }
    }

}
