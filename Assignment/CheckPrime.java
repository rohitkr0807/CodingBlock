package Assignment;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n= scrn.nextInt();
        int divisor=2;
        while (n>divisor){
            if(n%divisor==0){
                System.out.println("Not prime");
                return;
            }
            divisor++;
        }
        System.out.println("prime");
    }
}
