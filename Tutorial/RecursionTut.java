package Tutorial;

import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;

public class RecursionTut {     //Tutorial 7
    public static void main(String[] args) {
//        System.out.println(Sum("1223"));
//        System.out.println(Reverse("1203"));
//        System.out.println(isReverse("1","1"));
//        System.out.println(isPalindrome("12121"));
//        System.out.println(DuplicateStr("aami"));
//        System.out.println(moveXtoEnd("axgdsgdxs"));
        System.out.println(removeHi("hiahimhihimhgji"));

    }

    public static int Sum(String str) {
        int length = str.length();
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return str.charAt(0) - '0';
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        int sum = Sum(ros);
        return sum + (ch - '0');
    }

    public static String Reverse(String str) {
        int length = str.length();
//        char cc= str.charAt(0);
        String cc = str.substring(0, 1);

        String ros = str.substring(1);

        if (length == 1) {
            return cc;
        }
        String rev = Reverse(ros);
        return rev + cc;
    }

    public static boolean isReverse(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 == 0 && len2 == 0) {
            return true;
        }
        if (len1 == 0) {
            return false;
        }
        if (len2 == 0) {
            return false;
        }
        String ros1 = str1.substring(1);
        String ros2 = str2.substring(0, len2);
        char cc1 = str1.charAt(0);
        char cc2 = str2.charAt(len2 - 1);
        boolean Result = isReverse(ros1, ros2);
        if (cc1 != cc2) {
            return false;
        } else {
            return isReverse(ros1, ros2);
        }

    }

    public static boolean isPalindrome(String str) {
        int length = str.length();
        if (length == 1) {
            return true;
        }
        String ros = str.substring(1, length - 1);
        char cc1 = str.charAt(0);
        char cc2 = str.charAt(length - 1);
        if (cc1 != cc2) {
            return false;
        } else {
            return isPalindrome(ros);
        }
    }

    public static String DuplicateStr(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String ros = str.substring(1);
        char cc1 = str.charAt(0);
        char cc2 = str.charAt(1);
        String recResult = DuplicateStr(ros);
        String myResult = " ";
        if (cc1 == cc2) {
            myResult = cc1 + "*" + recResult;
        } else {
            myResult = cc1 + recResult;
        }
        return myResult;

    }

    public static String removeDup(String str) {
        if (str.length() <= 1) {
            return str;
        }
        char cc1 = str.charAt(0);
        char cc2 = str.charAt(1);
        String ros = str.substring(1);
        String recResult = removeDup(ros);
        String myResult = "";
        if (cc1 == cc2) {
            myResult = recResult;
        } else {
            myResult = cc1 + recResult;
        }
        return myResult;
    }

    public static String moveXtoEnd(String str) {
        if (str.length() == 0) {
            String baseResult = " ";
            for (int i = 0; i < str.length(); i++) {
                baseResult = baseResult + 'x';
            }
            return baseResult;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        String recResult = moveXtoEnd(ros);
        String myResult = "";
        if (cc == 'x' || cc == 'X') {
            myResult = recResult + cc;
        } else {
            myResult = recResult;
        }
        return myResult;
    }

    public static int countHi(String str) {
        int count = 0;
        if (str.length() <= 1) {
            return 0;
        }
        char cc1 = str.charAt(0);
        char cc2 = str.charAt(1);
        String ros = str.substring(1);
        int Recresult = countHi(ros);
        if (cc1 == 'h' && cc2 == 'i') {
            count = Recresult + 1;
        } else {
            count = Recresult;
        }
        return count;
    }

    public static String removeHi(String str) {
//        String myResult="";
//        char cc1= str.charAt(0);
//        char cc2= str.charAt(1);
//        String cc= str.substring(0,2);
//        String ros= str.substring(2);
//        String recResult= removeHi(ros);
//        if(cc1=='h'&&cc2=='i'){
//            myResult= recResult;
//        }else{
//            myResult= recResult+ cc1;
//        }
//
//        return myResult;
        if (str.length() < 2) {
            return str;
        }
        String chk = str.substring(0, 2);
        if (chk.equals("hi")) {
            String ros = str.substring(2);
            return removeHi(ros);
        } else {
            String ros = str.substring(1);
            char cc = str.charAt(0);
            return cc + removeHi(ros);
        }
    }

    public static String removeHiskipt(String str) {
        if (str.length() < 2) {
            return str;
        }
        String chkHi = str.substring(0, 2);
        String chkhit = "";
        if (str.length() <= 3) {
            chkhit = str.substring(0, 3);
        }
        if (chkHi.equals("hi") && !chkhit.equals("hit")) {
            String ros = str.substring(2);
            return removeHiskipt(ros);
        } else {
            String ros = str.substring(1);
            char cc = str.charAt(0);
            return cc + removeHiskipt(ros);
        }
    }

    public static ArrayList<String> printCodes(String str) {
        if (str.length() == 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        } else if (str.length() == 1) {
            ArrayList<String> baseResult = new ArrayList<>();
            String code = (str.charAt(0) - '1' + 'a') + "";
            baseResult.add(code);
            return baseResult;
        } else {
            ArrayList<String> myResult = new ArrayList<>();
            String ros1 = str.substring(1);
            char cc1 = str.charAt(0);
            ArrayList<String> recResult1 = new ArrayList<>();
            for (int i = 0; i < recResult1.size(); i++) {
                String code = ((char) (cc1 - '1' + 'a')) + "";
                myResult.add(code + recResult1.get(i));
            }
            if (cc1 <= '2') {
                String ros2 = str.substring(2);
                char cc2 = str.charAt(1);
                if (cc2 <= '6') {
                    ArrayList<String> recResult2 = printCodes(ros2);

                    for (int i = 0; i < recResult2.size(); i++) {
                        String code = ((char) ((cc1 - '0') * 10 + (cc2 - '0') - 1 + 'a')) + "";
                        myResult.add(code + recResult2.get(i));
                    }
                }
            }
            return myResult;

        }

    }

    public static String insideParanthesis(String str, boolean startFound) {
        if (str.length() <= 2) {
            return str;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        if (cc == '(') {
            String recResult = insideParanthesis(ros, true);
            return recResult;
        } else if (cc == ')') {
            return "";
        } else {
            String recResult = insideParanthesis(ros, startFound);
            String myResult = "";
            if (startFound) {
                myResult = cc + recResult;
            } else {
                myResult = recResult;
            }
            return myResult;
        }

    }
}
