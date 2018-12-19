package Recursion;

public class RecursionDemos {
    public static void main(String[] args) {
//        printincreasing(6);
//        System.out.println(factorial(12));
//        System.out.println(fib(6));
        int x=2;
        int y=24;

        System.out.println(powBetter(x,y));
        System.out.println(power(x,y));

    }

    public static void printDecreasing(int num) {
        if (num == 0) {
            return;
        }
        printDecreasing(num - 1);
        System.out.println(num);
    }

    public static void printincreasing(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        printincreasing(num - 1);
    }

    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else if (num == 0) {
            return 0;
        }


        int fn1 = factorial(num - 1);

        int fn = num * fn1;
        return fn;
    }

    public static int fib(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        int fib1 = fib(num - 1);
        int fib2 = fib(num - 2);
        int fn = fib1 + fib2;
        return fn;
    }
    public static int power(int x, int y){
        if(x==1){
            return 1;
        }if(y==0){
            return 1;
        }
        int f1= power(x,y-1);
        int f2= f1*x;
        return f2;
    }
    public static int powBetter(int x, int n){
        if(x==1){
            return 1;
        }if(n==0){
            return 1;
        }

        if(n%2==0){
            int rr= powBetter(x,n/2);
            return rr*rr;

        }else {
            int rr= powBetter(x, n/2);
            return rr*rr*x;
        }

    }
    public static int[] allindices(int [] arr, int value, int si, int counter){
      int [] recResult= null;
      int [] myResult= null;
      if(arr[si]==value){
          myResult=allindices(arr,value,si+1, counter+1);
          myResult= recResult;
          myResult[counter]= si;

      }
      else{
          recResult= allindices(arr,value,si+1,counter);
          myResult= recResult;

      }
      return myResult;
    }
}
