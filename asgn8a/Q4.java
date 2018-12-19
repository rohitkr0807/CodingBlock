package asgn8a;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String str = scn.nextLine();
		System.out.println(countPermutations(str, ""));
		printPermutations(str, "");
		System.out.println(getPermutations(str));
	}
	
	public static int countPermutations(String str, String result) {
		if (str.length() == 0) {
			return 1;
		}

		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			count += countPermutations(ros, result + cc);
		}
		
		return count;
	}

	public static void printPermutations(String str, String result) {
		if (str.length() == 0) {
			System.out.println(result);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			printPermutations(ros, result + cc);
		}
	}

	public static ArrayList<String> getPermutations(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();

			baseResult.add("");

			return baseResult;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> recResult = getPermutations(ros);
		ArrayList<String> myResult = new ArrayList<>();

		for (int i = 0; i < recResult.size(); i++) {
			String recString = recResult.get(i);

			for (int j = 0; j <= recString.length(); j++) {
				String myString = recString.substring(0, j) + cc + recString.substring(j);
				myResult.add(myString);
			}
		}

		return myResult;
	}

}
