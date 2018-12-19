package Geek4geek;

public class ReciprocalFact {
    public static void main(String[] args) {
//        Given a positive integer n, write a function to compute sum of the series 1/1! + 1/2! + .. + 1/n!
        System.out.println(fact(5));

    }
    public static int fact(int n){
       int res=1;
        for (int i = 1; i <=n ; i++) {
            res*=i;
        }
       return res;
    }
    public static double sum(int n){
        double sum=0;
        for (int i = 1; i <=n ; i++) {
            sum+=1.0/fact(i);
        }


        return sum;
    }
}
