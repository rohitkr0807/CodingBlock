package Company;

import java.util.*;


public class RepeatedCharacter {
    //    public static void main(String[] args) {
//        Scanner scrn = new Scanner(System.in);
//        int t=scrn.nextInt();
//        while (t>0){
//            String str= scrn.next();
//            int pos= RepeatedChar(str);
//            if(pos==-1){
//                System.out.println(-1);
//            }else{
//                char b= (char) pos;
//                System.out.println(b);
//            }
//            t--;
//        }
//
//    }
//    public static int  RepeatedChar(String str){
//       StringBuilder sb= new StringBuilder();
//        for (int i = 0; i <str.length() ; i++) {
//            for (int j = i+1; j <str.length() ; j++) {
//                if(str.charAt(i)==str.charAt(j)){
//                    return str.charAt(i);
//                }
//            }
//        }
//        return -1;
//    }
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int t= scrn.nextInt();
        scrn.nextLine();
        while (t-->0){
            String word= scrn.next();
            HashMap<Character,Integer> map= new HashMap<>();
            for (int i = 0; i <word.length() ; i++) {
                char ch= word.charAt(i);
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }else{
                    map.put(ch,1);
                }
            }

            for (int i = 0; i < word.length(); i++) {
                char ch=word.charAt(i);
                if(map.get(ch)>1){
                    System.out.println(ch);
                    break;
                }else{
                    System.out.println(-1);
                }
            }

        }

    }
}
