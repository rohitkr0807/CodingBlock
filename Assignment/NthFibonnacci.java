package Assignment;

import java.util.Scanner;

public class NthFibonnacci {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int a=0;
        int b=1;
        int counter=1;
        while (n>0){
            int sum= a+b;
            a=b;
            b= sum;
            n--;

        }
        System.out.println(a);
    }

}
