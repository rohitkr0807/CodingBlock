package asgn8a;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();

		printLexicoSmaller(str, "", str, false);
	}

	public static void printLexicoSmaller(String str, String result, String orig, boolean smaller) {
		if (str.length() == 0) {
			if (!result.equals(orig)) {
				System.out.println(result);
			}
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);

			if(smaller){
				String ros = str.substring(0, i) + str.substring(i + 1);
				printLexicoSmaller(ros, result + cc, orig, smaller);
			} else {
				if (cc <= str.charAt(0)) {
					String ros = str.substring(0, i) + str.substring(i + 1);
					printLexicoSmaller(ros, result + cc, orig, cc < str.charAt(0));
				}
			}
		}
	}

}
