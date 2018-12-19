package String;

public class RemoveDuplicateWord {
    public static void main(String[] args) {
        removeDuplicateWord("This this is is a a word");
    }

    public static void removeDuplicateWord(String str) {
        String ans= str.toLowerCase();
        StringBuilder sb= new StringBuilder();
        String str1[]= str.split(" ");
        for (int i = 1; i <str1.length ; i++) {
            if(str1[i-1].equals(str1[i])){
                sb.append(str1[i]);
            }
        }
        for (int i = 0; i <sb.length() ; i++) {
            System.out.print(sb.charAt(i)+" ");
        }
    }
}
