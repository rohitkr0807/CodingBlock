package HackerEarth;
import java.util.*;

public class ModuloSorting {
    public static void main(String[] args) {
        Scanner scrn= new Scanner(System.in);
        int n= scrn.nextInt();
        int k= scrn.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= scrn.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                if(arr[j]%k>arr[j+1]%k){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int elem: arr){
            System.out.print(elem+" ");
        }
    }
}
