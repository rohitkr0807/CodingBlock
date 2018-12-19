package Myntra;

import java.util.ArrayList;

public class RecursionAdvance {
    public static void main(String[] args) {
        System.out.println(sum("12345678987654323456789085438956789876543234567898765435439859835983457893"));
        System.out.println(number("1234"));

    }
    public static int  sum(String str){
        if(str.length()==1){
            int baseResult= str.charAt(0)-'0';
            return baseResult;
        }
        char cc= str.charAt(0);
        String ros= str.substring(1);
        int recResult= sum(ros);
        int myResult=recResult+(int)(cc-'0');
        return myResult;

    }
    public static int number(String str){
        if(str.length()==1){
            int myResult= str.charAt(0)-'0';
            return myResult;
        }
        String ros= str.substring(1);
        char cc= str.charAt(0);
        int recResult= number(ros);
        int myresult= (cc-'0')+recResult;
        return myresult;
    }

}
