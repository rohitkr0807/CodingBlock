package Assignment;

public class Stringlast {
    public static void main(String[] args) {
        System.out.println(lastword("thiadvkjnvkjdsnvkjsdn dkjvckldsjc kjdclksdjclk klasjdk kjshcskaj sjdklashd kjsdhkja skjasdh jdjskh skjadhajsk gsjghjkdf hgkjfhdjgjkdfhgjk ffdkjh jkgh fdkjkgj kjfhg jdfkgdfkjg kjfd kjgfghdfkjhkjbfdjkh  fjdkghdfkjhgkjdf  dfkgkdfghkhf  kgfkdfhgkfdhgkdfh k jfdgkjfhgjkf  fdkgkdfgjkldf  dfkjklfgklfd  fdkljkljkl is is     is a      boy"));

    }
    public static String lastword(String A){
        int c  =0;int k=0;
        String p[]= A.split(" ");
        return p[p.length-1];

    }
}
