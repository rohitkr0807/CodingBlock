package Company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class SecondMostString {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int t = scrn.nextInt();
        while (t-- > 0) {
            System.out.println(Occurance(scrn));
        }

    }

    public static String Occurance(Scanner scrn) {
        int n = scrn.nextInt();
        int count1 = 0;
        int count2 = 0;
        String str[] = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = scrn.next();
        }
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!hm.containsKey(str[i])) {
                hm.put(str[i], 1);
            } else {
                int count = hm.get(str[i]);
                hm.put(str[i], count + 1);
            }
        }
        int max = 0;
        int smax = 0;
        Iterator<Map.Entry<String, Integer>> itr = hm.entrySet().iterator();

        return null;
    }
}
