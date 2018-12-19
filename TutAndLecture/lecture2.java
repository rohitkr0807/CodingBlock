package TutAndLecture;

public class lecture2 {
    public static void main(String[] args) {
//        System.out.println(checkprime(1));
//        System.out.println(fibno(8));
//        primetillN(23);
        System.out.println(GCD(42,42));
    }

    public static boolean checkprime(int n) {
        int p = (int) Math.sqrt(n);
        for (int i = 2; i <= p; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int fibno(int n) {
        int fNo = 0;
        int sNo = 1;
        while (n - 1 > 0) {
            int sum = fNo + sNo;
            fNo = sNo;
            sNo = sum;
            n--;
        }
        return fNo;
    }

    public static void primetillN(int n) {
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            int counter = 2;
            while (counter * counter <= i) {
                if (i % counter == 0) {
                    isPrime = false;
                    break;
                }
                counter++;
            }
            if (isPrime == true) {
                System.out.println(i);
            }
        }
    }
    public static int GCD(int a, int b){
        if(b>a){
            int temp=b;
            b=a;
            a=temp;

        }
        if(a==b){
            return a;
        }
        int dividend=a;
        int divisor=b;
        while (divisor!=0){
            int temp= divisor;
            int rem=dividend%divisor;
            divisor=rem;
            dividend=temp;
        }
       return dividend;
    }
}
