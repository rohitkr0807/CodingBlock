package TutAndLecture;

public class RecursionDemo {
    public static void main(String[] args) {
//        printDecresing(4);
//        printIncreasing(4);
        System.out.println(factorial(4));
        System.out.println(power(2,5));
    }

    public static void printDecresing(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        printDecresing(num - 1);
    }

    public static void printIncreasing(int num) {
        if (num == 0) {
            return;
        }
        printIncreasing(num - 1);
        System.out.println(num);

    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        int fact = factorial(n - 1);
        return fact * n;
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int fnm2 = fib(n - 2);
        int fnm1 = fib(n - 1);
        return fnm1 + fnm2;
    }
    public static int power(int x, int n){
        if(n==1){
            return x;
        }
        int ans=power(x,n-1);
        return ans*x;
    }
}
