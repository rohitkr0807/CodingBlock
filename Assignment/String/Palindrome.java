package Assignment.String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        String str = scrn.next();
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        boolean retval = true;
        int i = 0;
        int b = str.length() - 1;
        while (i < b) {

            if (str.charAt(i) != str.charAt(b)) {

                retval = false;
                break;
            }
            i++;
            b--;


        }
        return retval;
    }
}
