package Test;

public class StringExample {
    public static void main(String[] args){
        String s1="Java";
        String str= new String("Patana");
//        str= "Gaya";
        System.out.println(str+" "+ s1);
        System.out.println(str.charAt(2));
        System.out.println(str.isEmpty());
        System.out.println(str.substring(1,3));
        System.out.println(str.contains("P"));
        System.out.println(str.concat("Amit"));
    }
}
