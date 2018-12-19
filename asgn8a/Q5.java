package asgn8a;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		System.out.println(toh("T1", "T2", "T3", n));
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
