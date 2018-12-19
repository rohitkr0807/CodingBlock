package HackerRank;
import java.util.*;

public class BreakingBestWorst {
    static int[] getRecord(int[] s){
        int a=0;
        int arr[]= new int[2];
        while (s.length>a){

            a++;

        }


        return arr;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        int y= Integer.MAX_VALUE;
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
