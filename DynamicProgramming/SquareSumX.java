package DynamicProgramming;

public class SquareSumX {
    public static void main(String[] args) {
//        It is always possible to represent a number in the form of sum of squares of numbers.
//
//                For example – 15= 3^2 + 2^2 + 1^2 + 1^2
//        Given a number x, find the minimum number of squares whose sum equals to x.
        System.out.println(minSquares(19));

    }
    public static int minSquares(int x){
        int minSq[]= new int[x+1];
        minSq[0]=0;
        minSq[1]=1;
        for (int i = 2; i <=x ; i++) {
            minSq[i]=i;
            for (int j = 1; j*j <=i ; j++) {
                minSq[i]=Math.min(minSq[i],1+minSq[i-j*j]);
            }
        }
        return minSq[x];
    }
}
