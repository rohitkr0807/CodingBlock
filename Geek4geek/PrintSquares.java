package Geek4geek;

import java.util.Scanner;

public class PrintSquares {
    public static void main(String[] args) {
//
// Given a natural number ‘n’, print squares of first n natural numbers without using *, / and -.
        printsquare(5);
        System.out.println();
        printbetterSquare(5);
    }

    public static void printsquare(int n) {
        for (int i = 0; i <5 ; i++) {
            System.out.print(i*i+" ");
        }
    }
    public static void printbetterSquare(int n){
        int square=0; int odd=1;
        for (int i = 0; i <n ; i++) {
            System.out.print(square+" ");
            square=square+odd;
            odd=odd+2;
        }
    }
}
