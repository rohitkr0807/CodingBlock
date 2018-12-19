package Company.GEDIGITAL;

public class GenerateArmStrong {
    public static void main(String[] args) {
        generate(1,1000);

    }
    public static void generate(int a, int b){
        for (int i = a+1; i < b; i++) {
            int temp=i;
            int n=0;
            while (temp!=0){
                int rem=temp%10;
                n=n+rem*rem*rem;
                temp/=10;
            }
            if(i==n){

                    System.out.println(i);


            }
        }
    }
}
