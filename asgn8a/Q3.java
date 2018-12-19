package asgn8a;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String str = scn.nextLine();
		System.out.println(countKeypadCombinations(str, ""));
		printKeypadCombinations(str, "");
		System.out.println(getKeypadCombinations(str));
	}
	
	public static int countKeypadCombinations(String str, String osf) {
		if (str.length() == 0) {
			return 1;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		int count = 0;
		String code = getCode(cc);
		for (int i = 0; i < code.length(); i++) {
			count += countKeypadCombinations(ros, osf + code.charAt(i));
		}
		
		return count;
	}
	
	public static void printKeypadCombinations(String str, String osf) {
		if (str.length() == 0) {
			System.out.println(osf);
			return;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		String code = getCode(cc);
		for (int i = 0; i < code.length(); i++) {
			printKeypadCombinations(ros, osf + code.charAt(i));
		}
	}
	
	public static ArrayList<String> getKeypadCombinations(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();

			baseResult.add("");

			return baseResult;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);

		ArrayList<String> recResult = getKeypadCombinations(ros);
		ArrayList<String> myResult = new ArrayList<>();

		String code = getCode(cc);
		for (int i = 0; i < recResult.size(); i++) {
			String recString = recResult.get(i);

			for (int j = 0; j < code.length(); j++) {
				String myString = code.charAt(j) + recString;
				myResult.add(myString);
			}
		}

		return myResult;
	}
	
	private static String getCode(char ch) {
		String retVal = "";

		switch (ch) {
		case '1':
			retVal = "abc";
			break;
		case '2':
			retVal = "def";
			break;
		case '3':
			retVal = "ghi";
			break;
		case '4':
			retVal = "jkl";
			break;
		case '5':
			retVal = "mno";
			break;
		case '6':
			retVal = "pqr";
			break;
		case '7':
			retVal = "stu";
			break;
		case '8':
			retVal = "vwx";
			break;
		case '9':
			retVal = "yz";
			break;
		case '0':
			retVal = ",. \n";
			break;
		default:
			retVal = "";
			break;
		}

		return retVal;
	}

}
