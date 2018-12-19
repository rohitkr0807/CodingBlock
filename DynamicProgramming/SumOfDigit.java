package DynamicProgramming;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sumofDigitsfrom1ToN(10));
        System.out.println(sumofDigits(43));

    }
   public static int sumofDigits(int n){
        int sum=0;
        while (n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
   }
   public static int sumofDigitsfrom1ToN(int num){
       int result=0;
       for (int i = 1; i <=num ; i++) {
           result+=sumofDigits(i);
       }
       return result;
   }
}