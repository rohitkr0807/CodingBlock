package HackerRank;

public class BST {
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

    private Node construct(int[] sa, int si, int li) {
        if (si > li) {
            return null;
        }
        int mid = (si + li) / 2;
        Node node = new Node(sa[mid], null, null);
        this.size++;
        node.left = construct(sa, si, mid - 1);
        node.right = construct(sa, mid + 1, li);
        return node;

    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public int size() {
        return this.size;
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
        }
    }

    private void remove(int item, Node node, Node parent, boolean ilc) {
        if (node == null) {
            return;
        }
        if (item > node.data) {
            this.remove(item, node.right, node, false);
        } else if (item < node.data) {
            this.remove(item, node.left, node, true);
        } else {
            if (node.left != null && node.right != null) {

            }
        }
    }

    public int size2(Node node) {
        if (node == null) {
            return 0;
        }
        int lsize = size2(node.left);
        int rsize = size2(node.right);
        return lsize + rsize + 1;
    }

    public int max(Node node) {
        if (node.right == null) {
            return node.data;
        }
        return this.max(node.right);
    }

    public int min(Node node) {
        if (node.left == null) {
            return node.data;
        }
        return this.min(node.left);
    }

    public boolean find(int item, Node node) {
        if (node == null) {
            return false;
        }
        boolean left = find(item, node.left);
        boolean right = find(item, node.right);
        if (left) {
            return true;
        } else {
            if (right) {
                return true;
            }
        }
        return false;
    }

    public boolean find2(int item, Node node) {
        if (node == null) {
            return false;
        }
        if (node.data == item) {
            return true;
        }
        if (item > node.data) {
            return this.find2(item, node.right);
        } else {
            return this.find2(item, node.left);
        }
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        int lh = height(node.left);
        int rh = height(node.right);
        int max = Math.max(lh, rh);
        return max + 1;

    }

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    public int diameter(Node node){
        if(node==null){
            return 0;
        }
        int f1= this.height(node.left)+ this.height(node.right);
        int f2= this.diameter(node.left);
        int f3= this.diameter(node.right);
        return Math.max(f1,Math.max(f2,f3));
    }
    private Node lca(Node node, int num1, int num2){

        if(node==null){
            return null;
        }
        if(num1>num2){
            int temp=num1;
            num1= num2;
            num2=temp;
        }
        if(node.data>num2){
            return this.lca(node.left,num1,num2);
        }else if(node.data<num1){
            return this.lca(node.right,num1,num2);
        }else{
            return node;
        }
    }
    public boolean isBST(Node root){
        return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);

    }
    private boolean isBST(Node node, int min, int max){
        if(node==null){
            return true;
        }
        if(node.data<min || node.data>max){
            return false;
        }
        return (isBST(node.left,min,node.data-1)&& isBST(node.right,node.data+1,max));
    }

}
