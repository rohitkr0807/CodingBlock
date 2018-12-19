package InterviewBit.String;

import java.math.BigInteger;
import java.util.BitSet;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = "";
//        System.out.println(length("A man ischutiya"));
//        System.out.println(lenghtofLastWord(str));
//        System.out.println(power("65366328742345677834324"));
//        System.out.println(counnt(10,20));
//        System.out.println(flipcount(10,20));
//        System.out.println(noof1(13));
//        System.out.println(countSub("1034$1"));
////        System.out.println(countonfinger(25));
//        System.out.println(java("rohit.java","gaya.java"));
        System.out.println(power(3,81));
    }

    public static int length(String str) {
        int i = 0;
        int j = str.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (i < j && str.charAt(j) == ' ') {
            i++;
            j--;
            if (str.charAt(j) == ' ') {
                String ros = str.substring(j + 1, str.length());
                return ros.length();
            }
        }
        return str.length();

    }

    public static int lenghtofLastWord(String str) {
        String arr[] = str.split(" ");
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            p = arr[arr.length - 1].length();
        }
        return p;
    }

    public static int power(String str) {
        BigInteger n = new BigInteger(str);
        if (n.equals(BigInteger.ONE) || n.bitCount() != 1) {
            return 0;
        }

        return 1;
    }

    public static String add(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) {
                sum = sum + b.charAt(j--) - '0';
            }
            if (i >= 0) {
                sum = sum + a.charAt(i--) - '0';
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();

    }

    public static int counnt(int a, int b) {
        int diff = a ^ b;
        int count=0;
        while (diff>0){
            diff-= diff & -diff;
            count++;
        }
        return count;

    }
    public static int countSub(String str){
        int count=0;
        for (int i = 0; i <str.length()-1 ; i++) {
            if(str.charAt(i)=='1' && str.charAt(i+1)=='0'){
                count++;
            }

        }
        return count;
    }
    public static int countonfinger(int n){
        int r= n%8;
        if(r==1){
            return r;
        }
        if(r==5){
            return r;
        }
        if(r==0 || r==2){
            return 2;
        }
        if(r==3 || r==7){
            return 3;
        }
        if(r==4|| r==6){
            return 4;
        }
        return 0;
    }
    public static int flipcount(int a, int b){
        int xor= a^b;
        int count=0;
        while (xor!=0){
            int rem=xor%2;
            if(rem==1){
                count++;
            }
            xor/=2;
        }
        return count;
    }
    public static int noof1(int n){
        int count=0;
        int p= n&n-1;
        System.out.println(p);
        while (n!=0){
           n = n&(n-1);
           count++;
        }
        return count;
    }
    public static boolean java(String str1, String str2){
       int length= str1.length();
       int length2= str2.length();
       String sub1= str1.substring(length-4,length);
       String strplit[]= str2.split(".");
        for (int i = 0; i <strplit.length ; i++) {
            System.out.println(strplit[i]);
        }
       if(sub1.equals("java")){
           return true;
       }
        return false;
    }
    public static int power(int a, int b){
        int power=1;
        int count=0;

        while (b!=power){
            count++;
            power=power*a;
        }
        return count;
    }

}
