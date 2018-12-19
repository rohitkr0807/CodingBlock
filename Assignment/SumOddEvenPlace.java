package Assignment;

import java.util.Scanner;

public class SumOddEvenPlace {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int sumodd = 0;
        int sumeven = 0;
        int counter = 1;
        while (n > 0) {
            int rem = n % 10;
            if (counter % 2 == 1) {
                sumodd = sumodd + rem;

            } else if(counter%2==0) {
                sumeven = sumeven + rem;
            }
            counter++;

            n = n / 10;
        }
        System.out.println("ODD SUM: "+ sumodd);
        System.out.println("EVEN SUM: "+ sumeven);
    }
}
