package Company;

import java.util.Scanner;

public class KthCharacterString {
    public static void main(String[] args) {
        Scanner scrn= new Scanner(System.in);
        int t= scrn.nextInt();
        while(t-->0){
            int m= scrn.nextInt();
            int k= scrn.nextInt();
            int n= scrn.nextInt();
            String str= Integer.toBinaryString(m);
            StringBuilder sb= new StringBuilder();
            for(int i=0; i<n; i++){
                char a[]= str.toCharArray();
                for (int j = 0; j <a.length ; j++) {
                    if(a[j]=='0'){
                        sb.append("01");
                    }else{
                        sb.append("10");
                    }
                }
                str= sb.toString();
                sb.delete(0,sb.length());
            }
            System.out.println(str.charAt(k));

        }

    }
}
