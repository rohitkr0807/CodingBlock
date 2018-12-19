import java.util.Scanner;

public class EditDistance {
    public static void main(String[] args) {
        Scanner scrn= new Scanner(System.in);
        int t= scrn.nextInt();
        while (t-->0){
            String str1= scrn.next();
            String str2= scrn.next();
            int m= str1.length();
            int n= str2.length();
            int ans= better(str1,str2,m,n);
            System.out.println(ans);
        }



    }
    public static int better(String str1, String str2, int m, int n){
        int dp[][]= new int[m+1][n+1];
        for (int i = 0; i <=m ; i++) {
            for (int j = 0; j <=n ; j++) {
                if(i==0){
                    dp[i][j]=j;
                }else if(j==0){
                    dp[i][j]= i;
                }else if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]= 1+ min(dp[i-1][j],dp[i][j-1],dp[i-1][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public static int min(int a, int b, int c){
        int min=Integer.MIN_VALUE;
      if(a>=b && c>=b){
          min=b;
      }
      if(b>=a && c>=a){
          min= a;
      }
      if(a>=c && b>=c){
          min= c;
      }
      return min;
    }
}


