package HackerRank;

public class Tree {
    private class Node{
        int data;
        Node left;
        Node right;
        public Node(int data, Node left, Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    public void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data+" ");
        this.preOrder(root.left);
        this.preOrder(root.right);
    }
    public void postOrder(Node root){
        if(root==null){
            return;
        }
        this.postOrder(root.left);
        this.postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public void inOrder(Node root){
        if(root==null){
            return;
        }
        this.inOrder(root.left);
        System.out.print(root.data+" ");
        this.inOrder(root.right);
    }
    public int size(Node root){
        if(root==null){
            return 0;
        }
        int lsize= size(root.left);
        int rsize= size(root.right);
        return lsize+rsize+1;
    }
    public int height(Node root){
        if(root==null){
            return -1;
        }
        int lheight= height(root.left);
        int rheight= height(root.right);
        int max= Math.max(lheight,rheight);
        return max+1;
    }
}
