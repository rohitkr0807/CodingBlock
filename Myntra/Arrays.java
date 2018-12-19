package Myntra;

public class Arrays {
    public static void main(String[] args) {
        int arr[]={123,24,121,34,45};
        System.out.println(max(arr));

    }
    public static int max(int arr[]){
        int max=arr[0];
        int start=0;
        int end=arr.length-1;
        while (end>=start){
            if(arr[start]>max){
                max=arr[start];
            }
            start++;
        }
        return max;
    }
    public static int findIndex(int arr[],int data){
        int start=0;
        int last=arr.length;

        while (start<=last){
            int mid=(start+last)/2;
            if(data>arr[mid]){
                start=mid+1;
            }else if(data<arr[mid]){
                last=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
