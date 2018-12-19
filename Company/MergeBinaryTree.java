package Company;

import java.util.ArrayList;

public class MergeBinaryTree {
    public class Node {
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    class BinarySearchTree {
        Node root;

        BinarySearchTree() {
            root = null;
        }

        public void inOrder() {
            inOrderUtil(root);
        }

        public void inOrderUtil(Node node) {
            if (node == null) {
                return;
            }
            inOrderUtil(node.left);
            System.out.print(node.data + " ");
            inOrderUtil(node.right);
        }
    }

    public ArrayList<Integer> storeInorderUtil(Node node, ArrayList<Integer> list) {
        if (node == null) {
            return list;
        }
        storeInorderUtil(node.left, list);
        list.add(node.data);
        storeInorderUtil(node.right, list);
        return list;
    }

    ArrayList<Integer> storeInorder(Node node) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = storeInorderUtil(node, list1);
        return list2;
    }
    ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> list3= new ArrayList<>();
        int i=0;
        int j=0;

        return list3;
    }
}
