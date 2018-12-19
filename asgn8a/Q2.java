package asgn8a;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String str = scn.nextLine();
		System.out.println(countSSWAscii(str, ""));
		printSSWAscii(str, "");
		System.out.println(getSSWAscii(str));
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
		count += countSSWAscii(ros, osf + (int)cc);

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
		printSSWAscii(ros, osf + (int)cc);
	}
	
	public static ArrayList<String> getSSWAscii(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();

			baseResult.add("");

			return baseResult;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> recResult = getSSWAscii(ros);
		ArrayList<String> myResult = new ArrayList<>();

		for (int i = 0; i < recResult.size(); i++) {
			myResult.add(recResult.get(i));
			myResult.add(cc + recResult.get(i));
			myResult.add((int)cc + recResult.get(i));
		}

		return myResult;
	}

}
