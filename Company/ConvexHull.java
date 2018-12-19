package Company;
import java.util.*;

public class ConvexHull {
    public static void main(String[] args) {
        Scanner scrn= new Scanner(System.in);
       int t= scrn.nextInt();
       while (t-->0){
           PutCommas(scrn);
       }


    }
    public static void PutCommas(Scanner scrn){
        int n= scrn.nextInt();
        int arr[]= new int[2*n];
        for (int i = 0; i <2*n ; i++) {
            arr[i]= scrn.nextInt();
        }
        for (int i = 0; i <2*n ; i++) {
            System.out.print(arr[i]+ " "+ arr[i+1]+ ",");


        }
    }
}
