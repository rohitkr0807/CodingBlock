package Goldman;

public class ReverseString {
    public static void main(String[] args) {
        String str="mno.pqr.abc";
//        System.out.println(reverse(str));
        System.out.println(solution(str));

    }
    public static String reverse(String str){
        System.out.println(str.length());
        String rev[]= str.split(" ");
        StringBuilder sb= new StringBuilder();
        for(int i=rev.length-1;i>=0;i--){
            sb.append(rev[i]+" ");
        }
        String ans= sb.substring(0,rev.length-1);
        System.out.println(ans.length());
        System.out.println(sb.length());
        return sb.toString();
    }
    public static String solution(String str){
        String word[]= str.split("\\.");
        StringBuilder sb= new StringBuilder();
        for(int i=word.length-1;i>=0;i--){
            sb.append(word[i]);
            sb.append(".");
        }

        String ans= sb.toString();
       return ans.substring(0,ans.length()-1);
    }
}
