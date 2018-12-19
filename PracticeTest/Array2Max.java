package PracticeTest;

import java.util.Scanner;
import java.util.*;

public class Array2Max {
    /*
    You need to print the largest element first followed by the second largest element and then other elements in the same sequence as given in the array(while displaying the elements should be in single line and separated by single space).
     */
    public static void main(String[] args) {
        Scanner scrn= new Scanner(System.in);
        int arr[]={29,79,17,8,4,9,97};
        int n= arr.length;
        Solution(arr,n);
    }
    public static void Solution(int arr[],int n){ArrayList al= new ArrayList();
        ArrayList bl= new ArrayList();
        LinkedList l= new LinkedList();
//        l.add()
        for(int i=0;i<n;i++){
            al.add(arr[i]);
        }
        Collections.sort(al);
        int a= (int) al.get(n-1);
        int b=(int) al.get(n-2);
        bl.add(a);
        bl.add(b);
        for(int i=0;i<n;i++){
            if(arr[i]!=a && arr[i]!=b){
                bl.add(arr[i]);
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(bl.get(i)+" ");
        }
    }
}
