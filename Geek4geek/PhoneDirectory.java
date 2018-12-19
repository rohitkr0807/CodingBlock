package Geek4geek;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneDirectory {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int t = scrn.nextInt();

        while (t > 0) {
            int n = scrn.nextInt();
            StringInout(scrn, n);
            t--;
        }
    }

    public static void StringInout(Scanner scrn, int n) {
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scrn.next();
        }
        Arrays.sort(s);
        String test = scrn.next();
        int x = 1;
        while (x <= test.length()) {
            int flag = 0;
            for (int i = 0; i < n; i++) {
                if(s[i].contains(test.substring(0,x))){
                    if(i<n-1 && s[i].equals(s[i+1])){
                        continue;
                    }
                    System.out.print(s[i]+" ");
                    flag=1;
                }
            }
        }
    }
}
