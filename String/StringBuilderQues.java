package String;

public class StringBuilderQues {
    public static void main(String[] args) {
        System.out.println(toggle("AAABaA"));
        System.out.println(evenOdd("Gaya"));

    }

    public static String toggle(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i)<='Z'){
//                upper case
                char ch= str.charAt(i);
                char togglechar= (char) (ch-'A'+'a');
                sb.append(togglechar);
            }else if(str.charAt(i)>='a' && str.charAt(i)<= 'z'){
                char ch= str.charAt(i);
                char togglechar= (char) (ch-'a'+'A');
                sb.append(togglechar);
            }

        }
        return sb.toString();
    }
    public static String evenOdd(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (i % 2 == 0) {
                //even
                char ch = str.charAt(i);
                char tbp = (char) (ch - 1);
                sb.append(tbp);

            } else {
                //odd
                char ch = str.charAt(i);
                char tbp = (char) (ch + 1);
                sb.append(tbp);
            }

        }


        return sb.toString();

    }
}
