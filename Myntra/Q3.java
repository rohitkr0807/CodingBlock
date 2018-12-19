package Myntra;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String str = scn.nextLine();
		System.out.println(toggleCase(str));
	}

	public static String toggleCase(String str) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);

			if (cc >= 'a' && cc <= 'z') {
				char fc = (char) ('A' + cc - 'a');
				sb.append(fc);
			} else if (cc >= 'A' && cc <= 'Z') {
				char fc = (char) ('a' + cc - 'A');
				sb.append(fc);
			}
		}

		return sb.toString();
	}

}
