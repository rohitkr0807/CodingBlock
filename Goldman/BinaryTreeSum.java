package Goldman;

public class BinaryTreeSum {
    public class Node{
        int data;
        Node left;
        Node right;
        Node nextRight;
        public Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
            this.nextRight=null;
        }
    }
    public class BinaryTree{
        Node root;
        int sum(Node node){
            if(node==null){
                return 0;
            }
            int lsum= sum(node.left);
            int rsum= sum(node.right);
            return lsum+rsum+node.data;
        }
    }

    public static void main(String[] args) {
        BinaryTreeSum bs= new BinaryTreeSum();

    }
}
