package Company.GEDIGITAL;

public class RemoveVowel {
    public static void main(String[] args) {
        System.out.println(remove("aaaaajkrngjdnkowrweitrwqiophul"));

    }
    public static String remove(String str){
//        String strnew= str.replace('a','c');
        String fnew= str.replaceAll("[aeiouAEIOU]","");

        return fnew;
    }
}
