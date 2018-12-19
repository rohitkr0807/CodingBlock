package String;
import java.util.*;

public class SubstringComparison {
    /*
    Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .
     */
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        StringBuilder sb= new StringBuilder();
        ArrayList<String> al= new ArrayList<>();
        for (int i = 0; i <=s.length()-k ; i++) {
            al.add(s.substring(i,i+k));
        }
        Collections.sort(al);
        smallest=al.get(0);
        largest=al.get(al.size()-1);



        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}


