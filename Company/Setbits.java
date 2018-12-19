package Company;

public class Setbits {
    public static void main(String[] args) {
//        System.out.println(setbits(11));
        System.out.println(countSetbitstoflipped(10,20));
    }
    public static int setbits(int n){
        int count=0;

        while (n!=0){
            int rem=n%2;
            if(rem==1){
                count++;
            }
            n/=2;
        }
        return count;
    }
    public static int countSetbitstoflipped(int m, int n){
        return setbits(m^n);
    }

}
