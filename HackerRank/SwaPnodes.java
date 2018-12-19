package HackerRank;

import javafx.util.Pair;

import java.util.Scanner;
import java.util.*;

public class SwaPnodes {
    public static void main(String[] args) {
        Scanner scrn= new Scanner(System.in);
        int n= scrn.nextInt();
        Pair [] array= new Pair[n+1];
        for (int i = 1; i <n+1 ; i++) {
            array[i]= new Pair(scrn.nextInt(),scrn.nextInt());
        }
        int T= scrn.nextInt();
        while (T-->0){
            int K= scrn.nextInt();
        }
    }
    private static void swap(Pair[] array, int K, int maxDepth){
        for(int i= K; i<=maxDepth; i+=K){
            swap(array,1,1);
        }
    }
    private static void swap(Pair[] array, int depthToSwap, int currIndex, int currDepth){
        if(currIndex<1){
            return;
        }
        Pair p= array[currIndex];
        if (currDepth==depthToSwap){

        }
    }
}
