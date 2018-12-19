package Recursion;

public class LCMArray {
    public static void main(String[] args) {
        System.out.println(gcd(6, 3));
        System.out.println(gcdbtr(66*2,66));

    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static int gcdbtr(int a,int b){
        if(b==0){
            return a;
        }
        return gcdbtr(b,a%b);
    }
}