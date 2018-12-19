package InterviewBit.String;

public class Palindrome {
    public static int palindrome(String str){
        int i=0;
        int j= str.length()-1;
        while (i<j){
            while (i<j && !Character.isLetterOrDigit(str.charAt(i))){
                i++;
            }
            while (i<j && !Character.isLetterOrDigit(str.charAt(j))){
                j--;
            }if(Character.toLowerCase(str.charAt(i))!=Character.toLowerCase(str.charAt(j))){
                return 0;
            }
            i++;
            j--;
        }
        return 1;
    }
}
