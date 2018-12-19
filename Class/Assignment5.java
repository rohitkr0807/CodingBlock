package Class;

import java.util.*;

public class Assignment5 {
    public static void main(String[] args) {
        String str = "aaabbbbb";
        System.out.println(removeDuplicate(str));

    }

    public static String removeDuplicate(String str) {
        StringBuilder sb = new StringBuilder();
         sb.append(str.charAt(0));
         char prevchar=str.charAt(0),currchar;
        for (int i = 1; i <str.length() ; i++) {
            currchar=str.charAt(i);
            if(prevchar!=currchar){
                sb.append(currchar);
            }
            prevchar=currchar;
        }


        return sb.toString();
    }

}
