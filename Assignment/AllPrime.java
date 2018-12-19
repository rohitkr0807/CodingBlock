package Assignment;

import java.util.Scanner;

public class AllPrime {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int counter = 2;
        while (counter <= n) {
            boolean isPrime = true;
            int divisor = 2;
            while (divisor < counter) {
                if (counter % divisor == 0) {
                    isPrime = false;
                   break;
                }
                divisor+=1;
            }
            if (isPrime) {
                System.out.println(counter);
            }


            counter+=1;


        }
    }
}
