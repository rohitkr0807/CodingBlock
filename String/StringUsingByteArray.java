package String;

public class StringUsingByteArray {
    public static void main(String[] args) {
        byte barr[]={23,101,107,103,115};
        char arr[]={'a','e','i','o','u'};
        System.out.println(arr.toString());

        String s= new String(arr);
        System.out.println(ans());
        System.out.println(s);

    }
    public static String ans(){
       String s1= "rohit";
       String s2="sweety";
       String ans="     Gaya is patna      ";
        System.out.println(ans);
        System.out.println(ans.trim());
       return s1.concat(s2);
    }

}
