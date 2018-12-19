package DirectI;

public class CountPermutation {
    public static void main(String[] args) {
        System.out.println(fact(25));
//        System.out.println(permutation("AaABC"));

    }

    public static int permutation(String str) {
        int length = str.length();
        int maxChar = 26;
        int freq[] = new int[maxChar];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a') {
                freq[str.charAt(i) - 'a']++;
            }

        }
        int fac = 1;
        for (int i = 0; i < 26; i++) {
            fac = fac * fact(freq[i]);
        }
        return fact(length)/fac;
    }

    public static int fact(int n) {
        int f[]= new int[n+1];
        f[0]=1;
        f[1]=1;
        f[2]=2;
        for (int i = 3; i <=n ; i++) {
            f[i]= f[i-1]*i;
        }
        return f[n];

    }
}
