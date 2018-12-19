package Company;

public class LargestCommonSubsequence {
    public static void main(String[] args) {

        String str1 = "ABCDGHLQR";
        String str2 = "AEDPHR";

        int result = lcsDynamic(str1.toCharArray(), str2.toCharArray());
        int result2=lcs(str1.toCharArray(),str2.toCharArray(),0,0);
        System.out.println(result2);
        System.out.print(result);

    }
    public static int lcsDynamic(char str1[], char str2[]){
        int temp[][]= new int[str1.length+1][str2.length+1];
        int max=0;
        for (int i = 1; i <temp.length ; i++) {
            for (int j = 1; j <temp[i].length ; j++) {
                if(str1[i-1]==str2[j-1]){
                    temp[i][j]=temp[i-1][j-1]+1;
                }else{
                    temp[i][j]=Math.max(temp[i-1][j],temp[i][j-1]);
                }
                if(temp[i][j]>max){
                    max=temp[i][j];
                }
            }
        }




        return max;
    }
    public static int lcs(char str1[],char str2[],int len1, int len2){

        if(len1 == str1.length || len2 == str2.length){
            return 0;
        }
        if(str1[len1] == str2[len2]){
            return 1 + lcs(str1,str2,len1+1,len2+1);
        }
        else{
            return Math.max(lcs(str1,str2,len1+1,len2),lcs(str1,str2,len1,len2+1));
        }
    }
}
