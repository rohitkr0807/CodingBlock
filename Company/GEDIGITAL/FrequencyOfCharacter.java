package Company.GEDIGITAL;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfCharacter {
    public static void main(String []args){
//        CharacterFrequency("asfadiuddka");
//        System.out.println(countWords("this is a boy"));
//        System.out.println(removeSpaces("This is a boy"));
        ArrayList<String> al= new ArrayList<>();
        al.add("Alok");
        al.add("Ram");
        al.add("Anoop");
        al.add("Gaya");
        System.out.println(Sort(al));
    }
    public static void CharacterFrequency(String str){
        char c;
        int k;
        for(c='A';c<='z';c++){
            k=0;
            for(int j=0;j<str.length();j++){
               char ch=str.charAt(j);
               if(ch==c){
                   k++;
               }
            }
            if(k>0){
                System.out.println(c+"   appears  "+k+"   times");
            }
        }
    }
    public static int countWords(String str){
        int count=1;
        for (int i = 0; i <=str.length()-1 ; i++) {
            if(str.charAt(i)==' '&& str.charAt(i+1)!=' '){
                count++;
            }
        }
        return count;
    }
    public static String removeSpaces(String str){
//        String ans= str.replaceAll(" ","");
//        return ans;
        char []strArray= str.toCharArray();
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i <strArray.length ; i++) {
            if(strArray[i]!=' '&& strArray[i]!='\t'){
                sb.append(strArray[i]);
            }
        }
        return sb.toString();

    }
    public static ArrayList<String> Sort(ArrayList<String> name){
        Collections.sort(name);

        return name;
    }
}
