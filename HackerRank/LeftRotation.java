package HackerRank;

import java.util.*;

public class LeftRotation {
    static int[] leftRotation(int[] a, int d) {
        int arr[]= new int[a.length];
        ArrayList<Integer> al = new ArrayList();
        for (int i = d; i < a.length; i++) {
            al.add(a[i]);
        }
        for(int i=0; i<d; i++){
            al.add(a[i]);
        }
        for (int i = 0; i <a.length ; i++) {
            arr[i]=al.get(i);
        }
        return arr;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
