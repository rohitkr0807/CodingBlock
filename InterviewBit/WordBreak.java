package InterviewBit;

import java.util.ArrayList;
import java.util.*;

public class WordBreak {
    public int wordBreak(String str, ArrayList<String> b) {
        int n = str.length();
        boolean[] dp = new boolean[n];
        Arrays.fill(dp, false);
        for (int idx = 0; idx < n; idx++) {
            for (int lws = idx; lws >= 0; lws--) {

            }
        }

        return 1;

    }

}

