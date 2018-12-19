package Class;

public class StringQuestions {
    public static void main(String args[]){
//        printallSubstring("Rohit");
        System.out.println(isPalindrome("paya"));
        System.out.println(palindromicSubstring("aba"));

    }
    public static void printallSubstring(String str){
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                System.out.println(str.substring(i,j));
            }
        }
    }
    public static boolean isPalindrome(String str){
        int start=0;
        int end= str.length()-1;
        while (start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static int palindromicSubstring(String str){
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                if(isPalindrome(str.substring(i,j))){
                    count++;
                }
            }
        }



        return count;
    }
}
