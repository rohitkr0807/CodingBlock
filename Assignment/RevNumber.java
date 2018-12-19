package Assignment;

import java.util.Scanner;

public class RevNumber {
    public static void main(String[] args) {
        Scanner scrn= new Scanner(System.in);
        int n= scrn.nextInt();
        int rev=0;
        while (n>0){
            int rem= n%10;
            rev= rev*10+rem;


            n=n/10;
        }
        System.out.println(rev);
    }
}
