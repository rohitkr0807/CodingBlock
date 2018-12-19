package DynamicProgramming;

public class PartitionSet {
    public static void main(String[] args) {
        /*
        Partition problem is to determine whether a given set can be partitioned into two subsets such that the sum of elements in both subsets is same.

Examples

arr[] = {1, 5, 11, 5}
Output: true
The array can be partitioned as {1, 5, 5} and {11}

arr[] = {1, 5, 3}
Output: false
The array cannot be partitioned into equal sum sets.



         */
        int arr[]={1,5,11,4};
        int n=arr.length;
        System.out.println(findPartition(arr,n));


    }
    public static boolean findPartition(int arr[], int n){
        int sum=0;
        for(int val: arr){
            sum+=val;
        }
        if(sum%2!=0){
            return false;
        }
        int sumhalf=sum/2;

        return issubset(arr,n,sum/2);
    }
    public static boolean issubset(int arr[], int n, int sum){
        if(sum==0){
            return true;
        }
        if(n==0 && sum!=0){
            return false;
        }
        if(arr[n-1]>sum){
            return issubset(arr,n-1,sum);
        }
        return issubset(arr,n-1,sum)||issubset(arr,n-1,sum-arr[n-1]);
    }
}
