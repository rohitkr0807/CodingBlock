package HackerRank.Recursion;

import java.util.Scanner;

public class PowerSum {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
//        int x = scrn.nextInt();
//        int n = scrn.nextInt();
        powerSum(100,3,1);

    }

    public static int powerSum(int sum, int power, int num) {
       int value= ( sum- (int)Math.pow(num,power));
       if(value<0){
           return 0;
       }
       else if(value==0){
           return 1;
       }
       else return powerSum(value,power,num+1) + powerSum(sum,power,num+1);

    }
}
