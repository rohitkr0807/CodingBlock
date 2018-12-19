package Myntra;

public class BinaryTree {
    public class Node{
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
    public BinaryTree(int rootData,BinaryTree leftST, BinaryTree rightST){
        this.root= new Node(rootData,null,null);
        
    }
    public int sum(Node node){
        if(node==null){
            return 0;
        }
        int lsum= sum(node.left);
        int rsum=sum(node.right);
        return node.data+lsum+rsum;
    }
    public boolean identicalTrees(Node root,Node otherroot){
        if(root==null && otherroot==null){
            return true;
        }
        return false;
    }

}
