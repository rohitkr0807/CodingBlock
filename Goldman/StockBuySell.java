package Goldman;

import java.util.Scanner;

public class StockBuySell {
    public static void main(String[] args) {
        /*
        First line contains number of test cases T. Each test case contain the integer value 'N' denoting days followed by an array of stock prices in N days.
Output:
The maximum profit is displayed as shown below. And if there is no profit then print "No Profit".
         */
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scrn.nextInt();
        }

    }
    public static void maximum(int arr[], int n){
        int start=0;
        int end= arr.length-1;
        while (start<end){

        }

    }
}
