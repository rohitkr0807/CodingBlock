package Geek4geek;

public class MAximumIndex {
    public static void main(String[] args) {
        int arr[]={3,5,7,9,2};
        int n= arr.length;
        System.out.println(max(arr,n));

    }
    public static int max(int arr[], int n){
        int max= arr[1]-arr[0];
        int maxDiff = 0;
        if (n ==2) {
            if(arr[0] < arr[1]) {
                System.out.println(1);
            }
        } else {
            for (int j = 0; j < n - 2; j++) {
                int tempMax = 0;
                for (int k = n - 1; k > j; k--) {
                    if (arr[j] <= arr[k]) {
                        //if (maxDiff < (k - j)) {
                        tempMax = k - j;
                        //System.out.println(j + " " + k);
                        break;
                        //}
                    }
                }
                if (tempMax > maxDiff) {
                    maxDiff = tempMax;
                    //break;
                }
            }
        }
        return maxDiff;
    }
}
