package InterviewBit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(7);
        a.add(7);
        a.add(8);
        a.add(8);
        a.add(10);
//        System.out.println(findCount(a, 8));
        System.out.println(sqrt(9));
        System.out.println(square(11));
//        System.out.println(searchRange(a, 7));

    }

    public static int findCount(final List<Integer> a, int b) {

        int count = 0;
        int p = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == b) {
                count++;
            }
        }
        return count;
    }

    public static void RotateArray(int[] arr, int d) {
        for (int i = 0; i < d; i++) {
            leftRotate(arr);

        }

    }

    public static void leftRotate(int arr[]) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
            arr[i] = temp;
        }
    }

    public static int sqrt(int a) {
        int p = 1;
        while (a >= p) {
            if (p * p == a) {
                return p;
            }

            p++;
        }
        return -1;
    }

    public static int square(int a) {
//        int m= (int) Math.sqrt(a);
        int x = -1;
        int y = 1;
        int d = 20;
        int z = (int) ((Math.pow(x, y)) % d);

        int p = 1 % 20;
        System.out.println(p);
        System.out.println(z);

        return 0;
    }
}


