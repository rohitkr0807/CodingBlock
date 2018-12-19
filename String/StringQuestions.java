package String;

public class StringQuestions {
    public static void main(String[] args) {
//        System.out.println("Gaya");
        String str = "Hello world";
//        PrintnewLine(str);
//        printallSubstring(str);
        System.out.println(isPalindrome("gagag"));
        System.out.println(countPalindromicSubstrings("gagag"));

    }

    public static void PrintnewLine(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static void printallSubstring(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                System.out.println(str.substring(i, j));
            }

        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length();
        while (left <= right) {
            if (str.charAt(left) == str.charAt(right-1)) {
                left++;
                right--;

            } else {
                return false;
            }
        }
        return true;
    }
    public static int countPalindromicSubstrings(String str){
        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            for(int j= i+1; j<=str.length();j++){
                if(isPalindrome(str.substring(i,j))){
                    counter++;
                }
            }
        }
        return counter;
    }
}
