package InterviewBit;

import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Merge {
    public static void main(String[] args) {
//        ArrayList a= new ArrayList();
//        ArrayList b= new ArrayList();
//        a.add(-5);
//
//        b.add(-5);
////        b.add(-2);
//        merge(a,b);
        int arr[] = {1, 1, 1, 2, 2};
        System.out.println(findNoOfTriangle(arr));
//        int pow10= (int) Math.pow(10,9);
//        int num= 2%pow10;
//        System.out.println(num);
    }
    public static void merge(ArrayList<Integer> a, ArrayList<Integer> b){
//
//        ArrayList<Integer> al= new ArrayList<>();
//        for (int i = 0; i <a.size() ; i++) {
//           al.add(a.get(i));
//        }
//        for (int i = 0; i <b.size() ; i++) {
//            al.add(b.get(i));
//        }
//        Collections.sort(al);
//        for (int i = 0; i <al.size() ; i++) {
//            System.out.print(al.get(i)+" ");
//        }
        a.addAll(b);
        Collections.sort(a);
    }
    public static int findNoOfTriangle(int arr[]){
        int n= arr.length;
        Arrays.sort(arr);
        int count=0;
        for (int i = 0; i <n-2 ; i++) {
            int k=i+2;
            for (int j = i+1; j <n ; j++) {
                while (k<n && arr[i]+arr[j]>arr[k]){
                    k++;
                    count=count+k-j-1;
                }
            }
        }
        return count;
    }
}
