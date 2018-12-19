package BitManipulation;

public class OnesComplementOther {
    public static void main(String[] args) {
        System.out.println(onescomolement(5));

    }
    public static int onescomolement(int n){
        int bits=numbits(n);
        return ((1<<bits)-1)^n;

    }
    public static int numbits(int num){
        int count=0;
        while (num!=0){
            if(num%2==1){
                count++;
            }
            num/=2;
        }


        return count;
    }
}
