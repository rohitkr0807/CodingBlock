package Company.HSBC;


public class ConsonantVowelCount {
    public static void main(String[] args) {
        countVowel("scabhwsbdhaaiwiweimou");
        System.out.println(vowel("scabhwsbdhaaiwiweimou"));
        System.out.println(countCharacter("s?!gdwhjd*u"));
    }

    public static void countVowel(String str) {
        System.out.println(str.length());
        String vowel[] = str.split("[aeiou]");
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < vowel.length; i++) {
            sb.append(vowel[i]);
        }
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println("Vowel count:"+(str.length()-sb.length()));

    }
    public static int vowel(String str){
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    public static int countCharacter(String str){
        StringBuilder sb= new StringBuilder();
        String Char[]= str.split("[?!*]");
        for (int i = 0; i <Char.length ; i++) {
            sb.append(Char[i]);
        }
        System.out.println(sb);
        return str.length()-sb.length();
    }
}
