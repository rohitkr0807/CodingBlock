package DynamicProgramming;

public class fib {
    public static void main(String[] args) {

    }
    public static int fiba(int n){
        int ans[]= new int[n+1];
        ans[0]=0;
        ans[1]=1;
        for (int i = 2; i <=n ; i++) {
            ans[i]= ans[i-1]+ans[i-2];
        }
        return ans[n];
    }
}
