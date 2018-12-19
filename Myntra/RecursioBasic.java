package Myntra;

public class RecursioBasic {
    public static void main(String[] args) {
        int arr[] = {23, 22, 12, 43, 45};
//        printNumDecresing(6);
//        System.out.println(nthTriangle(3));
        System.out.println(isAvailable(arr, 433, 0));
        System.out.println(index(arr, 45, 0));
    }

    public static void printNumDecresing(int num) {
        if (num <= 0) {
            return;
        }
        if (num % 2 == 1) {
            System.out.println(num);
        }
        printNumDecresing(num - 1);
        if (num % 2 == 0) {
            System.out.println(num);
        }

    }

    public static void starDecresing(int num) {
        if (num == 1) {
            System.out.println("*");
        }

    }

    public static int nthTriangle(int n) {
        if (n == 1) {
            return 1;
        }
        int p = nthTriangle(n - 1);
        return p + n;
    }

    public static boolean isSorted(int arr[], int si) {
        if (si == arr.length - 1) {
            return true;
        }
        if (arr[si] > arr[si + 1]) {
            return false;
        } else {
            boolean isSasorted = isSorted(arr, si + 1);
            return isSasorted;
        }
    }

    public static boolean isAvailable(int arr[], int item, int si) {
        if (si == arr.length) {
            return false;
        }
        if (arr[si] == item) {
            return true;
        } else {
            boolean ispresent = isAvailable(arr, item, si + 1);
            return ispresent;
        }
    }

    public static int index(int arr[], int item, int si) {
        if (si > arr.length - 1) {
            return -1;
        }
        if (arr[si] == item) {
            return si + 1;
        } else {
            int num = index(arr, item, si + 1);
            return num;

        }

    }
}
