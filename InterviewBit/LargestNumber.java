package InterviewBit;

import Array.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
//        System.out.println(allfactors(3875));
//        System.out.println(prime(84923));
//        Scanner scrn = new Scanner(System.in);
//        System.out.println(sieve(5));
//        System.out.println(reverse(-2345));
//        int n = scrn.nextInt();
//        System.out.println(isPalindrome(123));

//        System.out.println(cpFact(90,47));
//        int A[] = new int[n];
//        System.out.println(findDigitsInBinary(6));
//        for (int i = 0; i < A.length; i++) {
//        System.out.println(uniquePaths(2,3));
////            A[i] = scrn.nextInt();
//        System.out.println(fact(10));
////        System.out.println(isPower(8));
//        System.out.println(findRank("DTNGJPURFHYEW"));
//        }
//        largestNumber(A);
        int arr[]= {2,4,66,8,9,9,0};
//        System.out.println(largestNumber(arr));
        System.out.println(repeat(arr));
    }

    public static String largestNumber(final int[] A) {
        Arrays.sort(A);
        StringBuilder sb = new StringBuilder();
        for (int i = A.length - 1; i >= 0; i--) {
            sb.append(A[i]);

        }
        for (int i = 0; i <A.length ; i++) {
            System.out.println(sb.charAt(i));
        }

        return sb.toString();


    }

    public static int[] allfactors(int A) {
        int factornum = 1;

        ArrayList<Integer> factors = new ArrayList<>();
        while (A >= factornum) {
            if (A % factornum == 0) {
                factors.add(factornum);
            }


            factornum++;
        }
        int[] arr = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) {
            arr[i] = factors.get(i);
            System.out.println(arr[i]);
        }


        return arr;
    }

    public static int prime(int A) {
        if (A < 2) {
            return 0;
        }
        int number = 2;
        // ! upper bound
        int bound = (int) Math.sqrt(A);
        while (number <= bound) {
            if (A % number == 0) {
                return 0;
            }
            number++;
        }
        return 1;
    }

    public static int[] sieve(int A) {
        ArrayList al = new ArrayList();
        for (int i = 2; i <= A; i++) {
            int counter = 2;
            boolean isPrime = true;
            while (counter * counter <= A) {
                if (i % counter == 0) {
                    isPrime = false;
                    break;
                }
                counter++;
            }
            if (isPrime == true) {
                al.add(i);
            }

        }
        int arr[] = new int[al.size()];
        for (int j = 0; j < al.size(); j++) {
            arr[j] = (int) al.get(j);
            System.out.println(arr[j]);
        }
        return arr;
    }

    public static int gcd(int A, int B) {
        int divisor = A < B ? A : B;
        int dividend = A > B ? A : B;

        while (divisor != 0) {
            int oldDivisor = divisor;
            divisor = dividend % divisor;
            dividend = oldDivisor;
        }

        return dividend;
    }

    public static int reverse(int A) {
        int rev = 0;
        int B = Math.abs(A);
        while (B > 0) {
            int rem = B % 10;
            rev = rev * 10 + rem;
            B = B / 10;
        }
        if (A > 0) {
            return rev;
        } else if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        } else {
            return -rev;
        }
    }

    public static int isPalindrome(int A) {
        int rev = 0;
        int B = Math.abs(A);
        while (B > 0) {
            int rem = B % 10;
            rev = rev * 10 + rem;
            B = B / 10;
        }
        if (rev == A) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int cpFact(int A, int B) {
        int x = 0;
        while (x < B) {
            if (gcd(x, B) == 1 && A % x == 0 && x != 1) {

                return x;

            }


            x++;
        }
        return x;
    }

    public static String findDigitsInBinary(int A) {
        StringBuilder sb = new StringBuilder();
        int rev = 0;
        while (A != 0) {
            int rem = A % 2;
            rev = rev * 10 + rem;
            sb.insert(0, rem);
//           sb.append(rem);
            A = A / 2;
        }
        System.out.println(rev);


//        String str[]= new String[sb.length()];
//        for (int i =0; i >sb.length() ; i++) {
//            sb.append(sb.charAt(i));
////            System.out.println(sb.charAt(i));
//        }

        return sb.toString();

    }

    public static int uniquePaths(int a, int b) {
        if (a == 1 || b == 1) {
            return 1;
        }
        return (uniquePaths(a - 1, b) + uniquePaths(a, b - 1));
    }

    public static int isPower(int n) {
        for (int x = 2; x <= Math.sqrt(n); x++) {
            int y = 2;

            double p = Math.pow(x, y);

            while (p <= n && p > 0) {
                if (p == n)
                    return 1;
                y++;
                p = Math.pow(x, y);
            }
        }
        return 0;
    }

    public static int findRank(String str) {
        int length = str.length();
        int mul = fact(length);
        int rank = 1;
        int countRight;
        for (int i = 0; i < length; i++) {
            mul /= length - i;
            countRight = findSmallerInRight(str, i, length - 1);
            rank = rank + (countRight * mul);
        }

        return rank;
    }

    public static int fact(int a) {
        if (a == 1) {
            return 1;
        }
        int fact = fact(a - 1);
        return a * fact;
    }

    public static int findSmallerInRight(String str, int low, int high) {
        int countRight = 0;
        for (int i = low + 1; i <= high; i++) {
            if (str.charAt(i) < str.charAt(low)) {
                countRight++;
            }
        }
        return countRight;
    }


    public class Solution {
        static final int M = 1000003;

        int[] fs;

        void fillFactorials(int l) {
            fs = new int[l + 1];
            fs[0] = 1;
            for (int i = 1; i <= l; i++) {
                fs[i] = (fs[i - 1] * i) % M;
            }
        }

        public int findRank(String a) {
            int l = a.length();
            fillFactorials(l);

            int[] chars = new int[256];
            for (int i = 0; i < a.length(); i++) {
                byte c = (byte) a.charAt(i);
                chars[c]++;
            }

            int res = 1;
            for (int i = 0; i < l ; i++) {
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
    public static int repeat(int arr[]){
        Arrays.sort(arr);
        for (int i = 0; i <arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                return arr[i];
            }
        }
        return 0;
    }


}
