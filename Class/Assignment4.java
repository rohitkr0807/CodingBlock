package Class;
import java.util.*;

public class Assignment4 {
    public static void main(String[] args) {
        int arr1[]={3, 4, 5, 6, 7};
        int arr2[]={1,0,2,9,3,5};
        int sum=9;
//        threeTargetSum(arr1,sum);
//        sumOfTwoArray(arr2,arr1);
        intersection(arr1,arr2,arr1.length,arr2.length);

    }
    public static void twoTargetSum(int arr[], int sum){
        Arrays.sort(arr);
        int start=0;
        boolean found=false;
        int end=arr.length-1;
        while (start<=end){
            if(arr[start]+arr[end]==sum){
                found=true;
                System.out.println(arr[start]+"   "+arr[end]);
                start++;
                end--;
            }else if(arr[start]+arr[end]>sum){
                end--;
            }else{
                start++;
            }

        }
        if(found==false){
            System.out.println(-1);
        }
    }
    public static void threeTargetSum(int arr[], int sum){
        Arrays.sort(arr);
        for (int i = 0; i <arr.length-1; i++) {
            int start=i+1;
            int end= arr.length-1;
            while (start<=end){
                if(arr[start]+arr[end]==sum-arr[i]){

                    System.out.println(arr[start]+"   "+arr[end]+ " "+arr[i]);
                    start++;
                    end--;
                }else if(arr[start]+arr[end]>sum-arr[i]){
                    end--;
                }else{
                    start++;
                }

            }
        }
    }
    public static void sumOfTwoArray(int arr1[], int arr2[]){
        int num=0;
        int num2=0;
        Stack<Integer> s= new Stack<>();
        for(int i=arr1.length-1;i>=0;i--){
           num=num*10+arr1[(arr1.length-1)-i];
        }
        for(int i=arr2.length-1;i>=0;i--){
            num2=num2*10+arr2[(arr2.length-1)-i];
        }
       int sum=num+num2;
        while (sum!=0){
            int rem=sum%10;
            s.push(rem);

            sum/=10;
        }
        int arr[]= new int[s.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]= s.pop();
        }
        for(int p:arr){
            System.out.print(p+" ");
        }
    }
    public static void intersection(int arr1[], int arr2[], int m, int n){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0;
        while (i<m && j<n){
            if(arr1[i]>arr2[j]){
                j++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else{
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }

    }
}
