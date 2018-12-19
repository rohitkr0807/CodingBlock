package Geek4geek;

import java.util.Scanner;

public class ClosestString {
    public static void main(String[] args) {
        Scanner scrn= new Scanner(System.in);
        int t= scrn.nextInt();
        while (t-->0){
            int n= scrn.nextInt();
            String words[]= new String[n];
            for (int i = 0; i <n ; i++) {
                words[i]= scrn.next();
            }
            String s1= scrn.next();
            String s2= scrn.next();
            System.out.println(distance(words,n,s1,s2));
        }
    }
    public static int distance(String words[], int n, String s1,String s2){
        for (int i = 0; i <n ; i++) {
            int x=0;
           while (i+x<n){
               if(words[i].equals(s1)&& words[i+x].equals(s2)){
                   return x;
               }else if(words[i].equals(s2)&& words[i+x].equals(s1)){
                   return x;
               }
               x++;
           }
        }
        return 0;
    }
}
