import java.util.Scanner;

public class ContinuousSubArray {
    public static void main(String[] args) {
        Scanner scrn= new Scanner(System.in);
        int t= scrn.nextInt();
        while (t-->0){
            int n= scrn.nextInt();
            int sum= scrn.nextInt();
            int arr[]= new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]= scrn.nextInt();
            }
            foundbetween(arr,n,sum);

        }

    }

    public static void foundbetween(int arr[], int n, int sum) {
        int currsum, i, j;
        boolean found = false;
        for (i = 0; i < n; i++) {
            currsum = arr[i];
            for (j = i + 1; j <= n; j++) {
                if (currsum == sum) {
                    System.out.println((i + 1) + " " + (j));
                    found = true;
                    return;

                }
                if (currsum > sum || j == n) {
                    break;
                }
                currsum = currsum + arr[j];
            }

        }
        if (found == false) {
            System.out.println(-1);
        }
    }
}

