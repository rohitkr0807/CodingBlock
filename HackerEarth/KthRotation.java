package HackerEarth;
import java.util.*;

public class KthRotation {
    public static void main(String[] args) {
        Scanner scrn= new Scanner(System.in);
        int t= scrn.nextInt();
        while (t-->0){
            int n= scrn.nextInt();
            int k=scrn.nextInt();
            int arr[]= new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]= scrn.nextInt();
            }
            Kreverse(arr,k);

        }

    }
    public static void Kreverse(int arr[], int k){
        int n=arr.length;

        for (int i = n-k; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i <n-k ; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
