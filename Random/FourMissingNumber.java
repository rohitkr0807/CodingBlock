package Random;

import java.util.*;

public class FourMissingNumber {
    public static void main(String[] args) {
        int n = 10;
        int arr[] = {2, 5, 6, 3, 9};
        missingNumber(arr, n);
    }

    public static void missingNumber(int arr[], int n) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> bl = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 1; i <=n ; i++) {
            al.add(i);
        }
        for (int i = 0; i < arr.length ; i++) {
           int j=0;
                if(arr[i]!=al.get(j) && j<arr.length){
                    bl.add(al.get(j));
                    j++;

            }else{
                    i++;
                }
        }
        for (int i = 0; i <bl.size() ; i++) {
            System.out.print(bl.get(i)+" ");
        }

    }
}
