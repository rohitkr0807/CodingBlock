package DynamicProgramming;

public class PossiblePathFrom {
    public static void main(String[] args) {

//        Count all possible paths from top left to bottom right of a mXn matrix
//
//        The problem is to count all the possible paths from top left to bottom right of a mXn matrix with the constraints that from each cell you can either move only to right or down
        System.out.println(numberOfpath(2,3));
    }
    public static int numberOfpath(int m, int n){
        if(m==1||n==1){
            return 1;
        }
        return numberOfpath(m-1,n)+numberOfpath(m,n-1);
//        +numberOfpath(m-1,n-1) if diagonal movement is allowed;
    }
}
