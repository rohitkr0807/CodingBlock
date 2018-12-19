package HackerRank;
import java.util.*;

public class BreakRecord {
    static int[] getRecord(int[] s){
        int temp[]=s;
        int arr[]= new int[2];
        arr[0]= 0;
        arr[1]=0;
        int i=1;
        int best=s[0];
        int worst=s[0];
        for (int j = 0; j <s.length ; j++) {
            if(s[i]>best){
                arr[0]++;
                best=s[i];

            }
            if(s[i]<worst){
                arr[1]++;
                worst=s[i];

            }
        }

        return arr;

        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
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

