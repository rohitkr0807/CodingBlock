package Myntra;

public class Function {
    public static void main(String[] args) {
        System.out.println(Bin2Dec(1001));

    }

    public static int Bin2Dec(int num) {
        int retVal = 0;
        int basePower=1;
        while (num != 0) {
            int rem=num%10;
            retVal+=basePower*rem;
            basePower=basePower*2;
            num /= 10;
        }
        return retVal;


    }
}