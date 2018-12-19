package DynamicProgramming;

public class LinearEquation {
    public static void main(String[] args) {
        /*Given a linear equation of n variables, find number of non-negative integer solutions of it. For example,let the given equation be “x + 2y = 5”, solutions of this equation are “x = 1, y = 2”, “x = 5, y = 0” and “x = 1. It may be assumed that all coefficients in given equation are positive integers.

       */
        int coeff[]  = {2, 2, 5};
        int rhs = 4;
        int n = coeff.length;
        System.out.println(SolutionofLinearEquation(coeff,0,n-1,rhs));

    }
    public static int SolutionofLinearEquation(int []coeff, int start, int end, int rhs){
        if(rhs==0){
            return 1;
        }
        int result=0;
        for (int i = start; i <=end ; i++) {
            if(coeff[i]<=rhs){
                result+=SolutionofLinearEquation(coeff,start,end,rhs-coeff[i]);
            }
        }
        return result;
    }
}
