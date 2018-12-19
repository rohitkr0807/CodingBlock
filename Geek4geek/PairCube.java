package Geek4geek;
import javax.swing.JOptionPane;

import java.util.Scanner;

public class PairCube {


    public static void main(String[] args) {

        String mohit = JOptionPane.showInputDialog(null, "Enter your number", "The title", JOptionPane.PLAIN_MESSAGE);

        int t1 = Integer.parseInt(mohit);
        for (int i = 0; i < t1; i++) {
            String patel = JOptionPane.showInputDialog(null, "Enter your number", "The title", JOptionPane.PLAIN_MESSAGE);
            int n1 = Integer.parseInt(patel);

            System.out.println(paircube(n1));
        }
    }

    public static int paircube(int n) {


        int count = 0;
        for (int i = 1; i <=Math.cbrt(n); i++) {
            int cb= i*i*i;
            int diff= n-cb;
            int cuberoot= (int) Math.cbrt(diff);
            if(cuberoot*cuberoot*cuberoot==diff){
                count++;
            }
        }
        return count;
    }
}
