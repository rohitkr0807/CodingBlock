package Company;

import java.util.Scanner;

public class MergeStringAlternate {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int t= scrn.nextInt();
        while (t-->0){
            String str1= scrn.next();
            String str2= scrn.next();
            System.out.println(mergeAlternate(str1,str2));
        }
    }
    public static String mergeAlternate(String str1, String str2){
        int l1= str1.length();
        int l2= str2.length();
        if(l1==0){
            return str2;
        }
        if(l2==0){
            return str1;
        }
        String rv="";
        StringBuilder sb = new StringBuilder();
        int i=0;
        if(l1>l2){
            while (l1>i){
                sb.append(str1.charAt(i));
               while (i<l2){
                   sb.append(str2.charAt(i));
               }

                i++;
            }
        }
//        for (int i = 0; i <str2.length() ; i++) {
//            sb.append(str2.charAt(i));
//        }
        return sb.toString();
    }
}
