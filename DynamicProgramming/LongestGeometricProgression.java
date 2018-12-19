package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class LongestGeometricProgression {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        int t= scr.nextInt();
        while (t-->0){
            int n= scr.nextInt();
            int arr[]= new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=scr.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(lengthoflongestGP(arr,n));
        }

    }
    public static int lengthoflongestGP(int arr[], int n){
        if(n<2){
            return n;

        }
        if(n==2){
            return arr[1]%arr[0]==0?2:1;
        }
        int llgp=1;
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            if(arr[n-1]%arr[i]==0)
                dp[i][n-1]=2;
            else
                dp[i][n-1]=1;
        }
        for(int j=n-2;j>=0;j--){
            int i=j-1,k=j+1;
            while(i>=0&&k<=n-1){
                if(arr[i]*arr[k]<arr[j]*arr[j])
                    k++;
                else if(arr[i]*arr[k]>arr[j]*arr[j]){
                    if(arr[j]%arr[i]==0)
                        dp[i][j]=2;
                    else
                        dp[i][j]=1;
                    i--;
                }
                else{
                    dp[i][j]=dp[j][k]+1;
                    llgp=Integer.max(llgp,dp[i][j]);
                    i--;k++;
                }
            }
            while(i>=0){
                if(arr[j]%arr[i]==0)
                    dp[i][j]=2;
                else
                    dp[i][j]=1;
                i--;
            }
        }
        return llgp;
    }
}
