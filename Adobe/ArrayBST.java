package Adobe;

import java.util.Stack;

public class ArrayBST {
    public static void main(String[] args) {
        int pre[]={2, 4,1};
                int n= pre.length;

        System.out.println(isPOTBST(pre,n));

    }
    public static boolean isPOTBST(int pre[], int n){
        Stack<Integer> s= new Stack<>();
        // initialisze current root as min
        int root= Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            if(pre[i]<root){
                return false;
            }
            while (!s.isEmpty() && s.peek()<pre[i]){
                root=s.peek();
                s.pop();
            }
            s.push(pre[i]);
        }
        return true;
    }
}
