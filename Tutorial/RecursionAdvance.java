package Tutorial;

import java.util.ArrayList;

public class RecursionAdvance {
    public static void main(String[] args) {
        System.out.println(countSubseq("aabcd",""));
//        printSS("abcd", "");
//        System.out.println(getSS("abcd"));
//        System.out.println(countSSWAscii("ab", ""));
//        printSSWAscii("ab", "");
//        System.out.println(countPermutation("abcd",""));
//
//        System.out.println(StepstowerofHanoi(3));
//        System.out.println(toh("T1","T2","T3",3));
    }

    public static int countSubseq(String str, String osf) {
        if (str.length() == 1) {
            return 2;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        int count = 0;
        count = count + countSubseq(ros, osf);
        count += countSubseq(ros, osf + cc);
        return count;
    }

    public static void printSS(String str, String osf) {
        if (str.length() == 0) {
            System.out.println(osf);
            return;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);

        printSS(ros, osf + cc);
        printSS(ros, osf);
    }

    public static ArrayList<String> getSS(String str) {
        if (str.length() == 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> recResult = getSS(ros);
        ArrayList<String> myResult = new ArrayList<>();
        for (int i = 0; i < recResult.size(); i++) {

            myResult.add(cc + recResult.get(i));
            myResult.add(recResult.get(i));

        }
        return myResult;
    }

    public static int countSSWAscii(String str, String osf) {
        if (str.length() == 0) {
            return 1;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        int count = 0;
        count += countSSWAscii(ros, osf);
        count += countSSWAscii(ros, osf + cc);
        count += countSSWAscii(ros, osf + (int) cc);
        return count;
    }

    public static void printSSWAscii(String str, String osf) {
        if (str.length() == 0) {
            System.out.println(osf);
            return;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        printSSWAscii(ros, osf);
        printSSWAscii(ros, osf + cc);
        printSSWAscii(ros, osf + (int) cc);
    }

    public static int countKeypadCombinations(String str, String osf) {
        if (str.length() == 0) {
            return 1;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        int count = 0;
        String code= getcode(cc);
        for (int i = 0; i <code.length() ; i++) {
            count+=  countKeypadCombinations(ros,osf+code.charAt(i));
        }
        return count;
    }

    private static String getcode(char ch) {
        String retVal = "";
        switch (ch) {
            case '1':
                retVal = "abc";
                break;
            case '2':
                retVal = "def";
                break;
            case '3':
                retVal = "ghi";
                break;
            case '4':
                retVal = "jkl";
                break;
            case '5':
                retVal = "mno";
                break;
            case '6':
                retVal = "pqr";
                break;
            case '7':
                retVal = "stu";
                break;
            case '8':
                retVal = "vwx";
                break;
            case '9':
                retVal = "yz";
                break;
            case '0':
                retVal = ",. \n";
                break;
            default:
                retVal = "";
                break;

        }
        return retVal;
    }
    public static int countPermutation(String str, String result){
        if(str.length()==0){
            return 1;
        }
        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            char cc= str.charAt(i);
            String ros= str.substring(0,i)+str.substring(i+1);
            count+= countPermutation(ros,result+cc);
        }
        return count;
    }
    public static int StepstowerofHanoi(int n){
        int count=1;
        if(n==1){
            return count;
        }
        int steps= (int) Math.pow(2,n-1);
        return steps*2-1;

    }
    public static int toh(String src, String dest, String aux, int discs){
        if(discs == 0){
            return 1;
        }

        int count = 0;

        count += toh(src, aux, dest, discs - 1);
        System.out.println("Move " + discs + "th disc from " + src + " to " + dest);
        count += toh(aux, dest, src, discs - 1);

        return count;
    }
}
