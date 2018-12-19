package Recursion;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println(getPerms("gaya"));

    }

    public static ArrayList<String> getPerms(String str) {
        if (str.length() == 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;

        }

        char cc = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> recResult = getPerms(ros);
        ArrayList<String> myResult = new ArrayList<>();
        for (int i = 0; i < recResult.size(); i++) {
            String recString = recResult.get(i);
            for (int j = 0; j <= recString.length(); j++) {
                String myString = recString.substring(0, j) + cc + recString.substring((j));
                myResult.add(myString);
            }
        }

        return myResult;
    }
}
