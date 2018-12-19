package Myntra;

public class FibNumner {
    public static void main(String[] args) {
        System.out.println(fibno(10));

    }
    public static int fibno(int n){
        int fno=0;
        int sno=1;
        while (n-->0){
            int sum=fno+sno;
            fno=sno;
            sno=sum;
        }
        return fno;
    }
}
