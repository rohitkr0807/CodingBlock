package asgn8a;

import java.util.Scanner;

public class  Q9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();

		printLexicoGreater(str, "", str, false);
	}

	public static void printLexicoGreater(String str, String result, String orig, boolean larger) {
		if (str.length() == 0) {
			if (!result.equals(orig)) {
				System.out.println(result);
			}
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);

			if(larger){
				String ros = str.substring(0, i) + str.substring(i + 1);
				printLexicoGreater(ros, result + cc, orig, larger);
			} else {
				if (cc >= str.charAt(0)) {
					String ros = str.substring(0, i) + str.substring(i + 1);
					printLexicoGreater(ros, result + cc, orig, cc > str.charAt(0));
				}
				else{
					// cc<str.chatAt(0)
					// no calls.
				}
			}
		}
	}

}
