package asgn8a;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String str = scn.nextLine();
		System.out.println(countSS(str, ""));
		printSS(str, "");
		System.out.println(getSS(str));
	}
	
	public static int countSS(String str, String osf) {
		if (str.length() == 0) {
			return 1;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		int count = 0;
		
		count += countSS(ros, osf);
		count += countSS(ros, osf + cc);

		return count;
	}
	
	public static void printSS(String str, String osf) {
		if (str.length() == 0) {
			System.out.println(osf);
			return;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		printSS(ros, osf);
		printSS(ros, osf + cc);
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
			myResult.add(recResult.get(i));
			myResult.add(cc + recResult.get(i));
		}

		return myResult;
	}

}
