package DynamicProgramming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LengthOfLongestSub {
    public static void main(String[] args) {
//        Scanner scrn = new Scanner(System.in);
//        String str = scrn.next();
//        int arr[]={4,8,12};
//        int n= arr.length;
//        System.out.println(solution(arr,n));
//        System.out.println(factor(32));
        String str="aaaabcd";
        System.out.println(longestSubstring(str));
        System.out.println(lengthofLongest(str));

    }

    public static int longestSubstring(String str) {
        int p = 0;
        int length = str.length();
        Set<Character> set = new HashSet<>();
        int ans = 0;
        if (str.length() <= 1) {
            return str.length();
        }
        int i = 0, j = 0;
        while (i < length && j < length) {
            if (!set.contains(str.charAt(j))) {
                set.add(str.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(str.charAt(j++));
            }
        }
        return ans;
    }

    public static int lengthofLongest(String str) {
        int n = str.length();
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; j < n; j++) {
            if (map.containsKey(str.charAt(j))) {
                i = Math.max(map.get(str.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(str.charAt(j), j + 1);
        }
        return ans-1;
    }
    public static int factor(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        return count;
    }
    public static int solution(int arr[],int n){
        int ans=1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int product= arr[i]*arr[j];
                 ans= factor(product);

            }
        }

        return ans;
    }

}
