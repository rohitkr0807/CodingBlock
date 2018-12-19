package String;

public class LongestOccuringCharacter {
    public static void main(String[] args) {
        String str="+++----++++++-";
        int l= str.length();
        int p=Solution(str,l);
        System.out.println(p);
    }
    public static int Solution(String str, int l){
        char arr[]= str.toCharArray();
        int max=0;
        for (int i = 0; i < l; i++) {
            int count=0;
            while (str.charAt(i)=='+' && i<l ){

                count++;
                i++;



            }
            max=count;

        }
        return max;
    }
}
