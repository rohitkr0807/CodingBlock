package Geek4geek;

public class ValidParanthesis {
    public static void main(String[] args) {
        System.out.println(numbervalidParanthesis(4));

    }
    public static int numbervalidParanthesis(int n){
        int result=0;
        if(n<=1){
            return 1;
        }
        for (int i = 0; i <n ; i++) {
            result+= numbervalidParanthesis(i)*numbervalidParanthesis(n-i-1);
        }

        return result;
    }
}
