package DirectI;

public class StringPermutation {
    public static void main(String[] args) {
        String str= "AABC";
        int i=0;
        int j= str.length()-1;
//        System.out.println(swap(str,i,j));
        permutation(str,i,j);

    }
    public static String swap(String str, int i, int j){
        char temp;
        char chararr[]= str.toCharArray();
        temp=chararr[i];
        chararr[i]=chararr[j];
        chararr[j]=temp;
        return String.valueOf(chararr);

    }
    public static void permutation(String str,int i,int j){
        if(i==j){
            System.out.println(str);
        }
        for (int k = i; k <=j ; k++) {
            str=swap(str,i,k);
            permutation(str,i+1,j);
            str=swap(str,i,k);
        }
    }
}
