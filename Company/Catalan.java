package Company;

public class Catalan {
    public static void main(String[] args) {
        int n= 11;
//        System.out.println(catalan(n));
        System.out.println(catalanNum(n));

    }
    public static int factorial(int n){
        if(n==1 ||n==0){
            return 1;
        }
        int fact= factorial(n-1);
        return fact*n;
    }
    public static int catalan(int n){
        int p= factorial(2*n);
        int x=factorial(n+1);
        int r= factorial(n);
        int ans= p/(x*r);
        return ans;
    }
    public static int catalanNum(int n){
        int res=0;
        if(n<=1){
            return 1;
        }

        for (int i = 0; i <n ; i++) {
            res+= catalanNum(i)*catalanNum(n-i-1);
        }
        return res;
    }
}
