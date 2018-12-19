package HackerRank;
import java.util.*;
import java.util.Stack;

public class EqualStacks {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n1 = in.nextInt();
//        int n2 = in.nextInt();
//        int n3 = in.nextInt();
//        int h1[] = new int[n1];
//        for(int h1_i=0; h1_i < n1; h1_i++){
//            h1[h1_i] = in.nextInt();
//        }
//        int h2[] = new int[n2];
//        for(int h2_i=0; h2_i < n2; h2_i++){
//            h2[h2_i] = in.nextInt();
//        }
//        int h3[] = new int[n3];
//        for(int h3_i=0; h3_i < n3; h3_i++){
//            h3[h3_i] = in.nextInt();
//        }
//
//        System.out.println(EqualStack(h1,h2,h3));
        int arr1[]= {3,2,1,1,1};
        int arr2[]= {4,3,2};
        int arr3[]= {1,1,4,1};
        System.out.println(EqualStack(arr1,arr2,arr3));

    }
    public static int EqualStack(int arr1[],int arr2[], int arr3[]){
      reverse(arr1);
      reverse(arr2);
      reverse(arr3);
      int sum1=0;
      int sum2=0;
      int sum3=0;
        for (int i = 0; i <arr1.length ; i++) {
           sum1=sum1+arr1[i];
            arr1[i]=sum1;

        }
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println(arr1[i]);
        }
        for (int i = 0; i <arr2.length ; i++) {
            sum2=sum2+arr2[i];
            arr2[i]=sum2;
        }
        for (int i = 0; i <arr3.length ; i++) {
            sum3=sum3+arr3[i];
            arr3[i]=sum3;
        }
        int l1= arr1.length;
        int l2=arr2.length;
        int l3=arr3.length;
        int l=0;
        while (l2>l){

            int value=arr2[l];
            for (int i = 0; i <arr1.length ; i++) {
                if(arr1[i]==value){
                    return value;
                }
            }
            for (int i = 0; i <arr3.length ; i++) {
                if(arr3[i]==value){
                    return value;
                }
            }
            l++;
        }

        return 0;
    }
    public static void reverse(int arr[]){
      int left=0;
      int right= arr.length-1;
      while (right>left){
          int temp= arr[right];
          arr[right]=arr[left];
          arr[left]=temp;
          left++;
          right--;
      }

    }
}
