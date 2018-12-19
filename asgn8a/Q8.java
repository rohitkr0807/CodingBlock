package asgn8a;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		printLexico(n, 0);
	}
	
	public static void printLexico(int end, int curr){
		if(curr > end){
			return;
		}
		
		System.out.println(curr);
		for(int i = (curr == 0? 1: 0); i < 10; i++){
			printLexico(end, curr * 10 + i);
		}
	}

}
