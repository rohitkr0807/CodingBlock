package Geek4geek;

import java.util.Scanner;

public class SumofLength {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            int arr[] = new int[s.nextInt()];
            for (int i = 0; i < arr.length; i++)
                arr[i] = s.nextInt();
            int k = s.nextInt();
            int l = 0, ans = 0, check = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= k) {
                    l++;
                    if (arr[i] == k)
                        check = 1;
                } else {
                    if (check == 1)
                        ans += l;
                    l = 0;
                    check = 0;
                }
            }
            if (check == 1)
                ans += l;
            System.out.println(ans);
            t--;
        }
    }
}
