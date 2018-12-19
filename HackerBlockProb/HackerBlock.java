package HackerBlockProb;

import java.util.Scanner;

public class HackerBlock {
    public static void main(String[] args) {
//        GoodWord("aabbc");
        Scanner scrn = new Scanner(System.in);
        int num = scrn.nextInt();
        System.out.println(rev(num));

    }

    public static void GoodWord(String str) {

        int a = 0;
        char cc = str.charAt(0);
        char[] ch = new char[]{'a', 'e', 'i', 'o', 'u'};
        StringBuilder sb = new StringBuilder();
        sb.append(cc);

        String ros = str.substring(1);
        if (sb.equals(ch)) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }

    }

    public static int rev(int num) {
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev= rev*10+ rem;
            num = num / 10;
        }

        return rev;
    }
}
