package TutAndLecture;

public class StringQuestions {
    public static void main(String[] args) {
        printAllSubstring("abab");

    }

    public static void printAllSubstring(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length() - 1; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
    public static int countPalindromicSubstring(String str){
        int counter=0;
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                if(isPalindrome(str.substring(i,j))){
                    counter++;
                }
            }
        }
        return counter;
    }
}
