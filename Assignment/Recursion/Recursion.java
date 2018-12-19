package Assignment.Recursion;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
//        int n = scrn.nextInt();
//        printOdd(n);
//        printPattern(n,2,1);
//        printReversePattern(n, 1, 1);
        String str = scrn.next();
        remove(str);

    }

    public static void printOdd(int n) {

        if (n <= 0) {
            return;
        }
        if (n % 2 == 1) {
            System.out.println(n);
        }
        printOdd(n - 1);
        if (n % 2 == 0) {
            System.out.println(n);
        }

    }

    public static void printPattern(int n, int col, int row) {
        if (row > n) {
            return;
        }
        if (col > row) {
            System.out.println();
            printPattern(n, 1, row + 1);
            return;
        }
        System.out.print("*\t");
        printPattern(n, col + 1, row);

    }

    public static void printReversePattern(int n, int col, int row) {
        if (row > n) {
            return;
        }
        if (col > row) {
            printReversePattern(n, 1, row + 1);
            System.out.println();
            return;
        }
        printReversePattern(n, col + 1, row);
        System.out.print("*\t");


    }

    public static void printColumn(int n, int row, int col, int val) {
        if (row > n) {
            return;
        }
        if (col > row) {
            System.out.println();
            printColumn(n, 1, row + 1, 1);
            return;
        }
        System.out.print(val + " \t");
        printColumn(n, col + 1, row, (val * (row - col) / (col)));
    }

    public static int triangle(int n) {
        if (n == 0) {
            return 0;
        }
        int tm1 = triangle(n - 1);
        int tm = tm1 + n;
        return tm;
    }

    public static boolean isSorted(int arr[]) {
        int a = 0;
        if (arr.length < 0) {
            return false;
        }
        int isSort = arr[a + 1];
        if (arr[0] > isSort) {
            return false;
        } else
            return true;

    }

    public static void reverse(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverse(arr, left + 1, right - 1);
    }

    public static int sumDigit(String str) {
        if (str.length() == 1) {
            int baseResult = str.charAt(0) - '0';
            return baseResult;
        }
        char cc = str.charAt(0);
        String str1 = str.substring(1);
        int recresult = sumDigit(str1);
        int myresult = recresult + (cc - '0');

        return myresult;

    }

    public static void remove(String str) {
        String str1 = str.substring(1, str.length() - 1);
        System.out.println(str1);
    }

    public static int convertToInt(String str) {
        if (str.length() == 1) {
            int baseResult = str.charAt(0) - '0';
            return baseResult;
        }
        String ros = str.substring(0, str.length() - 1);
        char cc = str.charAt(str.length() - 1);
        int recResult = convertToInt(ros);
        int myResult = 10 * recResult + (cc - '0');
        return myResult;
    }

    public static String moveXToEnd(String str, int counter) {
        if (str.length() == 0) {
            String baseResult = " ";
            for (int i = 0; i < counter; i++) {
                baseResult += "x";
            }
            return baseResult;
        }
        String ros = str.substring(1);
        char cc = str.charAt(0);
        String recResult = " ";
        String myResult = " ";
        if (cc == 'x' || cc == 'X') {
            recResult = moveXToEnd(ros, counter + 1);
            myResult = cc + recResult;
        } else {
            recResult = moveXToEnd(ros, counter);
            myResult = recResult + cc;

        }
        return myResult;

    }

    public static int countHi(String str) {
        if (str.length() < 2) {
            return 0;
        }
        String chk = str.substring(0, 2);
        if (chk.equals("hi")) {
            String ros = str.substring(2);
            return 1 + countHi(ros);
        } else {
            String ros = str.substring(1);
            return countHi(ros);
        }
    }

    public static String removeHi(String str) {
        if (str.length() < 2) {
            return str;
        }
        String chk = str.substring(0, 2);
        if (chk == "Hi") {
            String ros = str.substring(2);
            return removeHi(ros);
        } else {
            String ros = str.substring(1);
            char cc = str.charAt(0);

            return cc + removeHi(ros);
        }
    }

    public static String replaceHiWBye(String str) {
        if (str.length() < 2) {
            return str;
        }
        String chk = str.substring(0, 2);
        if (chk.equals("hi")) {
            String ros = str.substring(2);
            return "bye" + replaceHiWBye(ros);
        } else {
            String ros = str.substring(1);
            char cc = str.charAt(0);
            return cc + replaceHiWBye(ros);

        }

    }
}

