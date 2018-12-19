package Company;

public class TotalNoOfStrings {
    public static void main(String args[]) {
        System.out.println(NumberOfStrings(3,1,2));
        System.out.println(countString(3));

    }

    public static int NumberOfStrings(int n, int bCount, int cCount) {
       /* Given 3 characters a, b, c. Find the number of strings of length n that can be formed from these 3 characters.
                Given that : we can use ‘a’ as many times as we want, ‘b’ maximum once, and ‘c’ maximum twice. */
        if (bCount < 0 || cCount < 0) {
            return 0;
        }
        if(n==0){
            return 1;

        }
        if(bCount==0 && cCount==0){
            return 1;
        }
       int res= NumberOfStrings(n-1,bCount,cCount);
        res+= NumberOfStrings(n-1,bCount-1,cCount);
        res+= NumberOfStrings(n-1,bCount,cCount-1);


        return res;

    }
    public static int countString(int n){
        return 1+(n*2)+(n*((n*n)-1)/2);
    }
}
