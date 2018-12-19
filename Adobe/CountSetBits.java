package Adobe;

public class CountSetBits {
    public static void main(String[] args) {
        /*
        Input : n = 6
Output : 2
Binary representation of 6 is 110 and has 2 set bits
         */
        System.out.println(countSetbits(13));

    }
    public static int countSetbits(int n){
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
}
