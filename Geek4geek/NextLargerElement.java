package Geek4geek;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class NextLargerElement {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int t = scrn.nextInt();
        while (t > 0) {
            Nextlarger(scrn);


            t--;
        }
    }

    public static void Nextlarger(Scanner scrn) {
        int n = scrn.nextInt();
        int arr[] = new int[n];


        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = scrn.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            boolean isGreater = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    System.out.print(arr[j]);
                    isGreater = true;
                    break;

                }
            }
            if (isGreater == false) {
                System.out.print(-1 + " ");
            }
            System.out.println();
        }

    }

    public static void NextGreater(int arr[], int n) {
        Stack<Integer> st = new Stack();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (st.isEmpty()) {
                st.push(arr[i]);
            }else{
                while (!st.isEmpty() && (int) st.peek()<arr[i]){
                    hm.put( st.pop(),arr[i]);
                }
                st.push(arr[i]);

            }
        }
    }
}
