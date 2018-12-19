package HackerRank;

import java.util.Scanner;

public class StairCase {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n= scrn.nextInt();
        printStair(n);
    }
    public static void printStair(int n){
        if(n==0){
            return;
        }
        if(n==1){
            System.out.println("#");
        }
        printStair(n-1);

    }
}
