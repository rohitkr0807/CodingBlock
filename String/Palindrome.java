package String;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isAnagram("aaabbb","bbaaa"));


    }
    public static void reverse(String str){
        StringBuilder sb= new StringBuilder();
        sb.append(str);
        String rev=sb.reverse().toString();
        if(str.equals(rev)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
  public  static boolean isAnagram(String a, String b) {
        if(a.length()!=b.length()){
            return false;
        }
        ArrayList<Character> al= new ArrayList<>();
        ArrayList<Character> bl= new ArrayList<>();
        for(int i=0;i<a.length();i++){
            al.add(a.charAt(i));
        }
        for(int i=0;i<a.length();i++){
            bl.add(b.charAt(i));
        }
        Collections.sort(al);
        Collections.sort(bl);

        for (int i = 0; i <al.size() ; i++) {
            if(al.get(i)!=bl.get(i)){
                return false;
            }
        }
        return true;
        // Complete the function
    }
}
