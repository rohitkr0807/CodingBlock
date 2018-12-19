package Geek4geek;

import java.util.Arrays;

public class NextGreaternumber {
    public static void main(String[] args) {
        char digits[]={'5','3','4','9','7','6'};
        int n=digits.length;
        nextGreater(digits,n);
//        Given a number n, find the smallest number that has same set of digits as n and is greater than n.
//        If x is the greatest possible number with its set of digits, then print “not possible”.

    }

    public static void nextGreater(char[] arr, int n) {
        int i;
        for (i = n - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                break;

            }
        }
        if (i==0){
            System.out.println("Not possible");
        }else{
            int x=arr[i-1], min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]>x && arr[j]<arr[min]){
                    min=j;
                }
            }
            swap(arr,i-1,min);
            Arrays.sort(arr,i,n);
            for (int j = 0; j <n ; j++) {
                System.out.println(arr[j]);
            }
        }


    }

    public static void swap(char arr[], int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
