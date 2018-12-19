package Assignment;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        char ch= scrn.next().charAt(0);
        System.out.println(typeofChar(ch));

//        int n = scrn.nextInt();
//        int m= scrn.nextInt();
//        int k = scrn.nextInt();
//        System.out.println(DigitOccurence(n, k));
//        int dec = bin2Dec(bin);
//        System.out.println(dec);
//        Dec2Bin(bin);
//        System.out.println(isArmStrong(n));
//        System.out.println(Sqrt(n));
//        System.out.println(root(m));
//        System.out.println(GCD(n,m));

    }

    public static int bin2Dec(int num) {
        int retVal = 0;
        int basePower = 1;
        while (num != 0) {
            int rem = num % 10;
            retVal = retVal + basePower * rem;
            basePower = basePower * 2;
            num = num / 10;
        }


        return retVal;
    }

    public static void Dec2Bin(int num) {
        int retval = 0;
        int Bin = 0;
        while (num != 0) {
            int rem = num % 2;
            System.out.print(rem);
            Bin = rem;
            rem = Bin;

            num = num / 2;
        }
    }

    public static int DigitOccurence(int n, int k) {
        int counter = 0;
        while (n != 0) {
            int rem = n % 10;
            if (rem == k) {
                counter++;
            }
            n = n / 10;
        }
        return counter;
    }

    public static boolean isArmStrong(int n) {
        int counter = 0;
        int rem = 0;
        int sum = 0;
        int orig = n;
        while (n != 0) {
            rem = n % 10;
            sum = sum + (int) Math.pow(rem, 3);
            counter++;


            n = n / 10;
        }
        System.out.println(sum);
        return orig == sum;

    }

    public static void PrintArmStrongNum(int begin, int end) {
        int num = begin;
        while (num <= end) {
            if (isArmStrong(num)) {
                System.out.println(num);
            }
            num++;
        }

    }

    public static int GCD(int n, int m) {
        int divisor = n < m ? n : m;
        int dividend = n > m ? n : m;

        while (divisor != 0) {
            int oldDivisor = divisor;
            divisor = dividend % divisor;
            dividend = oldDivisor;
        }

        return dividend;
    }
    public static int Sqrt(int n){
        int root=0;
        root= (int) Math.sqrt(n);
        return root;

    }
    public static int root(int m){
        int a=0;
        int p=m;
        while (m>a){
            if(p<a*a){
                return a-1;

            }
            a++;
        }
        return a;

    }
    public static char typeofChar(char ch){
        char retVal= '\0';
        if(ch>='a' && ch<='z'){
            retVal='L';
        }else if(ch>='A'&& ch<='Z'){
            retVal ='U';
        }else{
            retVal= 'I';
        }



        return retVal;
    }
}
