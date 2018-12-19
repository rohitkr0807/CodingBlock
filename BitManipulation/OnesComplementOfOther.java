package BitManipulation;

public class OnesComplementOfOther {
    public static void main(String[] args) {
//        System.out.println(areallBitset(1));
        System.out.println(isOnesComplementOfOther(5,26));

    }
    public static boolean areallBitset(int n){
        if(n==0){
            return false;
        }
        if(((n+1)&n)==0){
            return true;
        }
        return false;
    }
    public static boolean isOnesComplementOfOther(int a, int b){
        System.out.println(a^b);
        return areallBitset(a^b);
    }
}
