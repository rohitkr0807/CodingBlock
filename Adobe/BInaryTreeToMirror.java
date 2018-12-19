package Adobe;

public class BInaryTreeToMirror {
    class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;

        }
    }
    Node root;
     void mirror(){
        root=mirror(root);
    }
     Node mirror(Node root){
        if(root==null){
            return null;
        }
        Node leftans= mirror(root.left);
        Node rightans= mirror(root.right);
        return root;
    }

}
