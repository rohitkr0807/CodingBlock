package HackerEarth;
import java.util.*;

public class PalindromicString {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String arr[]= new String[N];

        for (int i = 0; i < N; i++) {
            arr[i]= s.next();
        }
        for (int i = 0; i <N ; i++) {
            if(isPalindrome(arr[i])){
                System.out.print("YES"+" ");
                if(arr[i].length()%2==0){
                    System.out.print("EVEN");
                    System.out.println();
                }else{
                    System.out.print("ODD");
                    System.out.println();
                }

            }else{
                System.out.println("NO");
            }
        }

    }
    public static boolean isPalindrome(String str){
        int start=0;
        int end=str.length()-1;
        while(end>=start){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
