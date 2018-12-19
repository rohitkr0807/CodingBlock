package String;

public class Assignment {
    public static void main(String[] args) {
        palindrome("gagag");
        System.out.println(countSubstring("gagag"));
        System.out.println(palindrome("gagagg"));
        System.out.println(removeDuplicate("aaaabbbca"));

    }

    public static boolean palindrome(String str) {
        int start = 0;
        int last = str.length() - 1;
//        while (str.length() > 0) {
        while (start <= last) {
            if (str.charAt(start) == str.charAt(last)) {

                start++;
                last--;
            } else {

                return false;
            }
        }

        return true;
    }

    public static int countSubstring(String str) {
        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                if(palindrome(str.substring(i,j))){
                    count++;
                }
            }
        }

        return count;
    }
    public static String removeDuplicate(String str){
        StringBuilder sb = new StringBuilder();
        int i=0;
        while (i<str.length()){
            char ch= str.charAt(i);
            sb.append(ch);
            while (i<str.length() && str.charAt(i)==ch){
                i++;
            }

            }
            return sb.toString();

    }

}
