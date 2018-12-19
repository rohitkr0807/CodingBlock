package Myntra;

public class Strring {
    public static void main(String[] args) {
//        allcharatcter("gaya");
//        toggleChar("gayBa");
//        System.out.println(removeDup("abbaaaaaacdfffgggghggg"));
        compress("aaabbbcdfff");
        System.out.println(getCompressed("aaabbccdefff"));
    }

    public static int countPalindromicSS(String str) {
        int retVal = 0;
        // for odd leng
        for (int axis = 0; axis < str.length(); axis++) {
            int orbit = 0;
            while (axis - orbit >= 0 && axis + orbit < str.length() && str.charAt(axis - orbit) == str.charAt(axis + orbit)) {
                retVal++;
                orbit++;
            }
        }
        for (int axis = 1; axis < str.length(); axis++) {
            int orbit = 1;
            while (axis - orbit >= 0 && axis + orbit - 1 < str.length() && str.charAt(axis - orbit) == str.charAt(axis + orbit - 1)) {
                retVal++;
                orbit++;
            }

        }


        return retVal;
    }

    public static void allcharatcter(String str) {
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
    }

    public static void toggleChar(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cc = str.charAt(i);
            if (cc >= 'a' && cc <= 'z') {
                char fc = (char) ('A' + cc - 'a');
                sb.append(fc);
            } else if (cc >= 'A' && cc <= 'Z') {
                char fc = (char) ('a' + cc - 'A');
                sb.append(fc);
            }
        }
        System.out.println(sb);
        System.out.println(sb.charAt(2));
        System.out.println(sb.length());
        System.out.println(sb.toString());
    }

    public static String removeDuplicate(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String removeDup(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        char prevchar = str.charAt(0);
        char currentchar;
        for (int i = 1; i < str.length(); i++) {
            currentchar = str.charAt(i);
            if (prevchar != currentchar) {
                sb.append(currentchar);
            }
            prevchar = currentchar;
        }
        return sb.toString();
    }

    public static void compress(String str) {
        int count=0;
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i <str.length()-1 ; i++) {
            if(str.charAt(i)==str.charAt(i+1)){
                sb.append(str.charAt(i)+count);
                count++;
            }
        }
        System.out.println(sb);
        System.out.println(count);
    }
    public static String getCompressed(String str){
        StringBuilder sb= new StringBuilder();
        char current='\0',previous='\0';
        int counter=0;
        for (int i = 0; i <str.length() ; i++) {
            current=str.charAt(i);
            if((current!=previous || (i==str.length())) && (counter!=0)){
                sb.append(counter+1);
            }
            if(current!=previous){
                sb.append(current);
                counter=0;
            }else{
                counter++;
            }
              previous=current;


        }
        return sb.toString();
    }
}
