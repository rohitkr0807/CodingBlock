package Class.Lecture2;

public class Lecture2 {
    public static void main(String[] args) {
//        System.out.println(Prime(31));
//        primetillN(20);
        System.out.println(reverse(2345));
        System.out.println(sumtoN(100));
        printallFib(36787654);

    }

    public static boolean Prime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;

            }
        }
        return true;
    }

    public static void primetillN(int n) {


        for (int num =2; num <= n; num++) {
            int counter = 2;
            boolean isPrime = true;
            while (counter * counter <= num) {
                if (num % counter == 0) {
                    isPrime = false;
                    break;
                }
                counter++;
            }
            if (isPrime == true) {
                System.out.println(num);
            }
        }
    }
    public static int reverse(int n){
        int rev=0;
        while (n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
    public static int sumtoN(int n){
        int sum=0;
        for (int i = 0; i <=n ; i++) {
            sum= sum+i;
        }


        return sum;
    }
    public static void  printallFib(int n){
        int fNo=0;
        int sNo=1;
        while (fNo<=n){
            System.out.println(fNo);
            int sum=fNo+sNo;
            fNo=sNo;
            sNo=sum;
        }
    }
}

