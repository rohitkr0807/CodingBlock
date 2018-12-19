package HackerRank;

import java.util.*;

public class GradingStudent {
    public static int[] solve(int[] grades) {
        int m = grades.length-1;
        ArrayList<Integer> al = new ArrayList();
        for (int i = 0; i < grades.length; i++) {
            al.add(grades[i]);

        }
        int arr[] = new int[al.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = al.get(i);
            while (m > 0) {
                int rem= arr[i]%10;
                if(rem>=0 && rem<=5){
                    rem=5;

                }

                m--;


            }
        }


        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }
}

