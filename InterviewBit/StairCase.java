package InterviewBit;

import java.util.ArrayList;
import java.util.HashSet;

public class StairCase {
    public static int climbStairs(int n){
        int arr[]= new int[100000];
        if(n<=3){
            return n;
        }
        if(arr[n]!=0){
            return arr[n];
        }

       arr[n]= climbStairs(n-1)+ climbStairs(n-2);
        return arr[n];

    }

    public static void main(String[] args) {
        System.out.println(climbStairs(17));
    }
}
