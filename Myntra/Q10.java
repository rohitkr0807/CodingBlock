package Myntra;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String str = scn.nextLine();
		System.out.println(getCompressed(str));
	}

	public static String getCompressed(String str) {
		StringBuffer buffer = new StringBuffer();

		char current = '\0', prev = '\0';
		int counter = 0;

		for (int i = 0; i < str.length(); i++) {
			current = str.charAt(i);

			if ((current != prev || (i == str.length() - 1)) && (counter != 0)) {
				buffer.append(counter + 1);
			}

			if (current != prev) {
				buffer.append(current);
				counter = 0;
			} else {
				counter++;
			}

			prev = current;
		}

		return buffer.toString();
	}

}
