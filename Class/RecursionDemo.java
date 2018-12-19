package Class;

public class RecursionDemo {
    public static void main(String[] args) {
        printLexico(9,19);

    }
    public static void printLexico(int end, int curr){
        if(curr>end){
            return;
        }
        System.out.println(curr);
        int start=0;
        if(curr==0){
            start++;
        }
        for (int i = start; i <=9 ; i++) {
            printLexico(end,curr*10+i);
        }
    }
}
