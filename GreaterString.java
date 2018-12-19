import java.util.Scanner;

public class GreaterString {
    public static void main(String[] args) {
        Scanner scrn= new Scanner(System.in);
        int n= scrn.nextInt();
        String arr[]= new String[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= scrn.next();
        }
        for (int i = 0; i <n ; i++) {
            System.out.println(getLexicographicallyGreaterString(arr[i]));
        }

    }
    public static String getLexicographicallyGreaterString(String s) {
        char[] w = s.toCharArray();
        int n = w.length;
        int i, j;
        int index = -1, index2 = 0;
        char t;
        StringBuilder result = new StringBuilder();
        for (i = n - 2; i >= 0; i--) {
            if (w[i] < w[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return "no answer";
        } else {
            for (j = n - 1; j > index; j--) {
                if (w[j] > w[index]) {
                    index2 = j;
                    break;
                }
            }
            t = w[index];
            w[index] = w[index2];
            w[index2] = t;
            for (i = 0; i <= index; i++) {
                result.append(w[i]);
            }
            StringBuilder x = new StringBuilder();
            for (i = index + 1; i < n; i++) {
                x.append(w[i]);
            }
            result.append(x.reverse().toString());
        }
        return result.toString();
    }

}
