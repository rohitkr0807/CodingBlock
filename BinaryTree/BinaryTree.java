package BinaryTree;

import java.util.Scanner;

public class BinaryTree {
    private class Node{
        int data;
        Node left;
        Node right;
        public Node(int data, Node left, Node right){
            this.data= data;
            this.left= left;
            this.right= right;

        }
    }
    private Node root;
    private int size;
    public BinaryTree(){
        Scanner scrn= new Scanner(System.in);


    }
    public BinaryTree(int []pre,int in[] ){
        Scanner scrn = new Scanner(System.in);
        this.construct(pre,0,0,in,0,0);
    }
    private Node construct(int pre[], int psi, int pli, int []in , int isi, int ili){
        if(psi>pli || isi>ili){
            return null;
        }
        Node node= new Node(pre[psi], null, null);
        this.size++;
        int searchIndex=-1;
        for (int i = isi; i <= ili ; i++) {
            if(node.data==in[i]){
                searchIndex=i;
                break;
            }
        }
        int ne= searchIndex- isi;
        node.left= this.construct(pre, psi+1, psi+ne, in, isi,searchIndex-1);
        node.right= this.construct(pre, psi+ne+1, pli, in, searchIndex+1,ili );
        return node;
    }
    private Node Construct(Scanner scrn, Node Parent, boolean isLeft){
        return null;
    }
}
