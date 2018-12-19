package Assignment.Complexity;

public class Sort01s {
    public static void main(String[] args) throws Exception {
        int arr[]= {1,0,1,1,0,1,1,1,0};
        sort01(arr);

    }

    public static void sort01(int arr[]) throws Exception {
        int left = 0;
        int right = arr.length - 1;
        if (arr[left] == 0 && arr[right] == 0) {
            left++;

        } else if (arr[left] == 0 && arr[right] == 1) {
            left++;
            right--;

        } else if (arr[left] == 1 && arr[right] == 0) {
            int temp= arr[left];
            arr[left]= arr[right];
            arr[right]=temp;
            left++;
            right--;

        } else if (arr[left] == 1 && arr[right] == 1) {
            right--;

        } else {
            throw new Exception("Array is invalid");
        }
    }
}
