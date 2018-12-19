package Company;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        byte x = 64;
        int i;
        byte y;
        i = x << 2;
        y = (byte) (x << 2);
        System.out.print(i + " " + y);

//        Scanner scrn = new Scanner(System.in);
//        String str= scrn.next();
//        System.out.println(divisible(str));
    }
    public static boolean divisible(String str){
        int sum=0;
        for (int i = 0; i <str.length() ; i++) {
            sum+= (int) str.charAt(i);
        }
        return sum%3==0;
    }
}
