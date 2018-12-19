package HackerEarth;
import java.util.*;

public class GoodString {
    public static void main(String args[]){
        Scanner scrn= new Scanner(System.in);
        String str= scrn.next();
        char ch;
        int a=0;
        int c=0;
        for (int i = 0; i <str.length() ; i++) {
            ch=str.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'||ch=='0'||ch=='u'){
                a++;
            }else{
                a=0;
            }
            c= Math.max(a,c);
        }
        System.out.println(c);
    }
}
