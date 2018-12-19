package InterviewBit.String;

public class ReverseTheString {
    public static String reverseWords(String str){
        String words[]= str.split(" ");
        String ans="";
        for(int i=words.length-1;i>=0;i--){
            ans=ans+words[i]+" ";
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
}
