package InterviewBit.String;

import java.util.*;

public class RomanToInt {
    private Map<Character, Integer> map = new HashMap<Character, Integer>() {
        {
            map.put('I', 1);
            map.put('V', 5);
            map.put('C', 100);
            map.put('X', 10);
            map.put('L', 50);
            map.put('D', 500);
            map.put('M', 1000);
        }

    };

    public int romanToInt(String str) {
        int result = 0;
        int i = 0;
        int len = str.length();
        while (i < len) {
            int num = map.get(str.charAt(i));
            if (i + 1 < len && num < map.get(str.charAt(i + 1))) {
                result = result - num;
            } else {
                result = result + num;
            }
            i++;
        }
        return result;
    }


}

