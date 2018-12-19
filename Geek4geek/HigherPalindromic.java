package Geek4geek;
import java.math.BigInteger;
import java.util.*;

public class HigherPalindromic {
    public static void main(String args[]){
        Scanner scrn= new Scanner(System.in);
        LinkedList ll= new LinkedList();

        System.out.println("45354");


    }
    public static String HigherPalindrome(String str){
        int max= 0;
        int n= str.length();
        int i=0;
       while (i<n/2){
           if((int)(str.charAt(i))>max){
               max= str.charAt(i);
               i++;
               break;

           }
           i++;
       }
        System.out.println(max);


        return "-1";
    }
}

