package Geek4geek;

import java.util.Arrays;
import java.util.Stack;

public class LongestValidParantheses {
    public static void main(String[] args) {
        String str= ")()())";
        System.out.println(longestParantheses(str));

    }
    public static int longestParantheses(String str){
        char arr[]= str.toCharArray();
        Arrays.sort(arr);
        int i=0;
        int n=arr.length-1;
        int count=0;
        while (i<=n){
            if(arr[i]=='('&& arr[n]==')'){
                count++;
                i++;
                n--;
            }
            i++;
            n--;

        }
        return count*2;
    }
}
