package Company;

import java.util.Scanner;

public class ConsecutiveRepeating {
    public static void main(String[] args) {
        Scanner scrn= new Scanner(System.in);
//        int t= scrn.nextInt();

//        Maximum consecutive repeating character in string

        System.out.println(RepeatingCharacter("Geekkkkkuuuuuu"));
        System.out.println(maxRepeating("geeekkkk"));

    }
    public static char  RepeatingCharacter(String str){
        int l= str.length();
        int max=0;
        char res= str.charAt(0);
        int cur_count=1;
        for (int i = 0; i <l ; i++) {
            if(i<l-1 && str.charAt(i)==str.charAt(i+1)){
                cur_count++;
            }else{
                if(cur_count>max){
                    max=cur_count;
                    res=str.charAt(i);
                }
                cur_count=1;
            }
        }
        return res;
    }
    public static char maxRepeating(String str){
        char ch= str.charAt(0);
        int length= str.length();
        int count=0;
        for (int i = 0; i <length ; i++) {
            int cur_count=1;
            for (int j = i+1; j <length ; j++) {
                if(str.charAt(i)!=str.charAt(j)){
                    break;

                }
                cur_count++;
            }
            if(cur_count>count){
                count=cur_count;
                ch=str.charAt(i);
            }
        }



        return ch;
    }
}
