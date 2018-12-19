package Geek4geek;

public class SimpleExpression {
    public static void main(String[] args) {
        EvaluateExpression("23");
        /*You are given a string that represent an expression of digits and operands. E.g. 1+2*3, 1-2+4. You need to evaluate the string or the expression. NO BODMAS is followed. If the expression is of incorrect syntax return -1.
Test cases:
a) 1+2*3 will be evaluated to 9.
b) 4-2+6*3 will be evaluated to 24.
c) 1++2 will be evaluated to -1(INVALID).
Also, in the string spaces can occur. For that case we need to ignore the spaces. Like :- 1*2 -1 is equals to 1.
*/

    }
    public static void EvaluateExpression(String str){
        int sum=0;
        sum=Integer.parseInt(str);
        for (int i = 1; i <str.length() ; i++) {
            if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'){

            }
        }
        System.out.println(sum);
    }
}
