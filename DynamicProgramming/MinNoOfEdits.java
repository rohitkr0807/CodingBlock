package DynamicProgramming;

import java.util.Scanner;

public class MinNoOfEdits {
    public static void main(String[] args) {
        Scanner scrn= new Scanner(System.in);
        String str1= scrn.next();
        String str2= scrn.next();
        int n1= str1.length();
        int n2= str2.length();
        System.out.println(minEdit(str1,str2,n1,n2));
//        System.out.println(min(2,2,2));
    }
    public static int minEdit(String str1, String str2, int m, int n){
        if(m==0){
            return n;
        }
        if(n==0){
            return m;
        }
        if(str1.charAt(m-1)==str2.charAt(n-1)){
            return minEdit(str1,str2,m-1,n-1);
        }


        return 1+min(minEdit(str1,str2,m,n-1),minEdit(str1,str2,m-1,n),minEdit(str1,str2,m-1,n-1));
    }
    public static int min(int x, int y, int z){
       if(x>y && z>y){
           return y;
       }else if(y>x && z>x){
           return x;
       }else{
           return z;
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
}
