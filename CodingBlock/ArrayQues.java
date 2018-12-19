package CodingBlock;

import java.util.Arrays;

public class ArrayQues {
    public static void main(String[] args) {
        int[] arr = {33, 11, 44, 0, 22};
//        System.out.println(binarySearch(arr,44));
//        bubbleSort(arr);
        System.out.println(log(2,8));
    }

    public static int binarySearch(int arr[], int value) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > value) {
                right = mid - 1;
            }else  if(arr[mid]==value){
                return mid;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
    public static int binarySearch2(int arr[], int value){
        Arrays.sort(arr);
        int left=0;
        int right= arr.length-1;
        while (right>=left){
            int mid= (left+right)/2;
            if(arr[mid]==value){
                return mid;
            }
            left++;
            right--;
        }
        return -1;
    }
   public static void bubbleSort(int []arr){
       for (int i = 0; i <arr.length ; i++) {
           for (int j = i+1; j <arr.length ; j++) {
               if(arr[i]>arr[j]){
                   int temp= arr[i];
                   arr[i]= arr[j];
                   arr[j]= temp;

               }
           }

       }
       for(int pr:arr){
           System.out.println(pr);
       }
   }
   public static int log(int base, int num){
       int count=1;
       int value=0;
       if(num==1){
           return 0;
       }else{
           while (count!=num){
               count=count*base;
               value++;


           }
       }
       return value;
   }
}
