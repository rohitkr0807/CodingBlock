package DynamicProgramming;

public class ShortestString {
    public static void main(String[] args) {
//        You are given two strings. Find the length of the shortest string that has both the given strings as subsequences.
        System.out.println(commonLength("APQRSTU","KPLRMNTUO"));
    }

    public static int commonLength(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int temp[][] = new int[len1 + 1][len2 + 1];
        for (int i = 0; i <=len1 ; i++) {
            temp[i][0]=i;
        }
        for (int i = 0; i <=len2 ; i++) {
            temp[0][i]=i;
        }
        for (int i = 1; i <=len1 ; i++) {
            for (int j = 1; j <=len2 ; j++) {
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    temp[i][j]=temp[i-1][j-1]+1;
                }else{
                    temp[i][j]= Math.min(temp[i-1][j],temp[i][j-1])+1;
                }
            }
        }
        return temp[len1][len2];
    }
}
