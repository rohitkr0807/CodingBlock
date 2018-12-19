package Company;

import java.util.*;

public class SplitWordsDot {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int t = scrn.nextInt();
        while (t-- > 0) {
            String str = scrn.next();
            String[] words= str.split("\\.");
            String rev= "";
            for(int i= words.length-1;i>=0;i--){
                rev=rev+words[i]+".";

            }
            rev=rev.substring(0,rev.length()-1);
            System.out.println(rev);


        }
    }
}