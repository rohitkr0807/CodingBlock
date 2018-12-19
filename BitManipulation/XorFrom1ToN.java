package BitManipulation;

public class XorFrom1ToN {
    public static void main(String[] args) {
        System.out.println(xorfrom1ton(4));

    }
    public static int xorfrom1ton(int n){
        if(n%4==0){
            return n;
        }
        if(n%4==3){
            return 0;
        }
        if(n%4==1){
            return 1;
        }
        if(n%4==2){
            return n+1;
        }
        return 0;
    }
}
