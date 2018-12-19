package Geek4geek;

import java.util.Scanner;

public class SimilrExpression {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int t = scrn.nextInt();
        while (t > 0) {
            Expression();
            t--;
        }


    }

    public static void Expression() {
        Scanner scrn = new Scanner(System.in);
        String str1 = scrn.next();
        System.out.println(str1);
        String str2 = scrn.next();
        StringBuilder sb = new StringBuilder(str1);
        System.out.println(sb);


        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == '+' && str1.charAt(i + 1) == '(') {
                sb.deleteCharAt(i + 1);
                for (int j = 0; j < str1.length() - 1; j++) {
                    if (str1.charAt(j) == ')') {
                        sb.deleteCharAt(j - 1);
                    }
                }
                System.out.println(sb);
            }
            if (str1.charAt(i) == '-' && str1.charAt(i + 1) == '(') {
                sb.deleteCharAt(i + 1);
                for (int j = 0; j < str1.length() - 1; j++) {
                    if (str1.charAt(j) == ')') {
                        sb.deleteCharAt(j - 1);
                    }
                    for (int k = i; k < j; k++) {
                        if (str1.charAt(k) == '+') {
                            sb.deleteCharAt(k);
                            sb.append('-');
                        } else if (str1.charAt(k) == '-') {
                            sb.deleteCharAt(k);
                            sb.append('+');
                        }
                    }
                    System.out.println(sb);

                }
            }
            if (str1.charAt(0) == '(') {
                sb.deleteCharAt(0);
                for (int j = 0; j < str1.length() - 1; j++) {
                    if (str1.charAt(j) == ')') {
                        sb.deleteCharAt(j - 1);
                    } else {

                    }
                }
                System.out.println(sb);


            }
        }
    }
}
