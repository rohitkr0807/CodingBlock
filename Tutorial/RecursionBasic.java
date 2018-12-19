package Tutorial;


import java.util.Arrays;


public class RecursionBasic {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 5, 3, 4, 5};
//        System.out.println(Nthtriangle(2));
//        System.out.println(isFound(arr, arr.length-1, 6));
//        System.out.println(found(arr, arr.length - 1, 5));
        System.out.println(isPalindrome(arr, 0, arr.length - 1));

    }

    public static int Nthtriangle(int n) {
        if (n == 1) {
            return 1;
        }
        int nthtria = Nthtriangle(n - 1);
        int sum = n + nthtria;
        return sum;
    }

    public static boolean isSorted(int arr[], int si) {
        if (si == arr.length - 1) {
            return true;
        }
        if (arr[si] > arr[si + 1]) {
            return false;
        } else {
            boolean isSort = isSorted(arr, si + 1);
            return isSort;
        }
    }

    public static boolean isFound(int arr[], int si, int m) {
//        Arrays.sort(arr);
        if (si == arr.length) {
            return true;
        }
        if (arr[si] == m) {
            return true;
        } else {
            boolean found = isFound(arr, si + 1, m);
            return found;
        }
    }

    public static int found(int arr[], int si, int m) {
        if (si == 0) {
            return -1;
        }
        if (arr[si] == m) {
            return si;
        } else {
            int Found = found(arr, si - 1, m);
            return Found;
        }
    }

    public static int[] allIndices(int[] arr, int num, int si, int count) {
        if (si == arr.length) {
            return new int[count];
        }
        int indices[] = null;
        if (arr[si] == num) {
            indices = allIndices(arr, num, si + 1, count + 1);
        } else {
            indices = allIndices(arr, num, si + 1, count);
        }
        if (arr[si] == num) {
            indices[count] = si;
        }
        return indices;
    }

    public static boolean isPalindrome(int arr[], int si, int li) {
        if (si == arr.length - 1 && li == 0) {
            return true;
        }
        boolean Palindrome = isPalindrome(arr, si + 1, li - 1);
        if (arr[si] == arr[li]) {
            return Palindrome;
        } else {
            return false;
        }
    }

    public static int[] printReverse(int arr[]) {
        int si=0;
        int li= arr.length-1;
        if(arr.length<=1){
            return arr;
        }
        return arr;
    }

}
