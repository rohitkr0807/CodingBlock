package Goldman;

import java.util.HashMap;

public class ExcelCoumnName {
    public static void main(String[] args) throws Exception {
        System.out.println(ColumnNum(3));
        System.out.println(titleNumber("Z"));

    }

    public static String ColumnNum(int n) {
        char ch[] = new char[256];
        int i = 0;
        while (n != 0) {
            int rem = n % 26;
            if (rem == 0) {
                ch[i++] = 'Z';
                n = n / 26 - 1;
            } else {
                ch[i++] = (char) ((rem - 1) + 'A');
                n = n / 26;
            }
        }
        ch[i] = '\0';
        return ch.toString();
    }

    public static int titleNumber(String str) throws Exception {
        if (str.length() <= 0) {
            throw new Exception("Invalid");
        }
        HashMap<Character, Integer> map = new HashMap<>();
        char c = 'A';
        for (int i = 1; i <= 26; i++) {
            map.put(c, i);
            c += 1;
        }
        int result = 0;
        int i = str.length()-1;
        int t = 0;
        while (i >= 0) {
            char current = str.charAt(i);
            result += (int) Math.pow(26, t) * map.get(current);
            t++;
            i--;
        }


        return result;
    }
}
