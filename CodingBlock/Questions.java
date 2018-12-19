package CodingBlock;


import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        System.out.println(countFIve(556665));

    }
    public static int countFIve(int num){
        int count=0;
        while (num!=0){
            int rem= num%10;
            if(rem==5){
                count++;
            }
            num=num/10;
        }
        return count;
    }
    public static int bin2Dec(int bin){
        int dec=0;
        Scanner scanner= new Scanner(System.in);
        char ch= scanner.next().charAt(0);
        int twoPower=1;
        while (bin!=0){
            int rem=bin%10;
            int component= rem*twoPower;
            dec= dec+component;
            twoPower= twoPower*2;
            bin=bin/10;
        }
        return dec;

    }
}
