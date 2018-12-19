package Geek4geek;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Scanner scrn= new Scanner(System.in);
        int t= scrn.nextInt();
        for (int i = 0; i <t ; i++) {
            int n= scrn.nextInt();
            reverse(n,scrn);
        }
    }
    public static void reverse(int n, Scanner scrn){
        Stack stack= new Stack();
        for (int i = 0; i <n ; i++) {
            int arr[]= new int[n];
            arr[i]= scrn.nextInt();

            stack.push(arr[i]);
        }
        for (int i = n; i >0 ; i--) {
            System.out.print(stack.pop()+ " ");
        }
    }
}
