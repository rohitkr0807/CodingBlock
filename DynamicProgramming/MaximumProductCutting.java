package DynamicProgramming;

public class MaximumProductCutting {
    public static void main(String[] args) {
        System.out.println(maxProduct(10));

        /*
        Given a rope of length n meters,
         cut the rope in different parts of integer lengths in a way that maximizes product of lengths of all parts. You must make at least one cut.
          Assume that the length of rope is more than 2 meters.

Examples:

Input: n = 2
Output: 1 (Maximum obtainable product is 1*1)

Input: n = 3
Output: 2 (Maximum obtainable product is 1*2)

Input: n = 4
Output: 4 (Maximum obtainable product is 2*2)

Input: n = 5
Output: 6 (Maximum obtainable product is 2*3)

Input: n = 10
Output: 36 (Maximum obtainable product is 3*3*4)
         */
    }
    public static int maxProduct(int n){
      if(n==2 || n==3){
          return n-1;
      }
      int res=1;
      while (n>4){
          res=res*3;
          n=n-3;
      }

      return n*res;

    }
}
