package Company;

import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        String str = scrn.next();
        System.out.println(getCharCountArray("geeksforgeek"));
    }

    public static int getCharCountArray(String str) {
        char[] count = new char[256];
        int index = -1;
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                index = i;
                break;
            }
        }
        return index;
    }


}
