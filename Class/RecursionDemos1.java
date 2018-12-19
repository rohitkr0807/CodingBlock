package Class;

public class RecursionDemos1 {
    public static void main(String[] args) {
//        decreasing(7);
//        increasing(4);

//        System.out.println(factorila(16));
//        System.out.println(factorial(16));
        System.out.println(removeDuplicates("aaabbbccd"));
        System.out.println(compression("qqqaaabbc"));

    }

    public static void decreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        decreasing(n - 1);

    }

    public static void increasing(int n) {
        if (n == 0) {
            return;
        }
        increasing(n - 1);
        System.out.println(n);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return n;
        }
        if (n == 0) {
            return 0;
        }
        int fact = factorial(n - 1);
        return fact * n;
    }

    public static int factorila(int n) {
        int temp[] = new int[n + 1];
        temp[0] = 1;
        temp[1] = 1;
        temp[2] = 2;
        for (int i = 3; i <= n; i++) {
            temp[i] = i * temp[i - 1];
        }


        return temp[n];
    }

    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            sb.append(ch);
            while (i < str.length() && str.charAt(i) == ch) {
                i++;
            }



        }
        return sb.toString();
    }

    public static String compression(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            int counter = 0;
            sb.append(ch);
            while (i < str.length() && str.charAt(i) == ch) {
                i++;
                counter++;

            }
            if (counter != 1) {
                sb.append(counter);
            }

        }


        return sb.toString();
    }
}
