package CodingBlock.DynamicProgramming;

public class LadderProblem {
    public static void main(String[] args) {
        System.out.println(Solution(4));
    }
    public static int Solution(int n){
        int temp[]= new int[n+1];
//        if(n<0){
//            return 0;
//        }
//        if(n==0){
//            temp[0]=1;
//        }
        temp[0]=1;
        temp[1]=1;
        temp[2]=2;
        temp[3]=4;

        for(int i=4;i<=n;i++){
            temp[i]=temp[i-1]+temp[i-2]+temp[i-3];
        }



        return temp[n];
    }
}
