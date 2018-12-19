package InterviewBit;

public class SortedRankLexigraphically {
    public static void main(String[] args) {
        System.out.println(findRank("4321"));

//        Given a string, find the rank of the string amongst its permutations sorted lexicographically.
//        Assume that no characters are repeated.

    }

    public static final int M = 1000003;
    public static int fs[];

    public static void fillFactorial(int l) {

        fs = new int[l + 1];
        fs[0] = 1;
        for (int i = 1; i <= l; i++) {
            fs[i] = (fs[i - 1] * i) % M;
        }
    }

    public static int findRank(String a) {
        int l = a.length();
        fillFactorial(l);
        int chars[] = new int[256];
        for (int i = 0; i < l; i++) {
            byte c = (byte) a.charAt(i);
            chars[c]++;
        }
        int res = 1;
        for (int i = 0; i < l; i++) {
            int lessThan = 0;
            for (int j = 0; j < (byte) a.charAt(i); j++) {
                lessThan += chars[j];

            }
            res += fs[l - i - 1] * lessThan % M;
            chars[a.charAt(i)] = 0;

        }


        return res % M;
    }
}
