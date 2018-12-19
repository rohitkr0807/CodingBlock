package Revision.BTandBST;

import Assignment.BinaryTree.BinaryTree;

public class BinartTree {
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
    private Node root;
    int size;
    public void BinaryTree(int rootData, BinaryTree leftST, BinaryTree rightST ){
        this.root= new Node(rootData,null,null);

    }
}
