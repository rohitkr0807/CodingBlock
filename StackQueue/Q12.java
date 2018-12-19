package StackQueue;

import java.util.ArrayList;
import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String str = scn.nextLine();
		System.out.println(getCodes(str));
	}

	public static ArrayList<String> getCodes(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<>();
			
			baseResult.add("");
			
			return baseResult;

		} else if (str.length() == 1) {
			ArrayList<String> baseResult = new ArrayList<>();

			String code = ((char)(str.charAt(0) - '1' + 'a')) + "";
			baseResult.add(code);

			return baseResult;
		} else {
			ArrayList<String> myResult = new ArrayList<>();

			String ros1 = str.substring(1);
			char cc1 = str.charAt(0);
			ArrayList<String> recResult1 = getCodes(ros1);

			for (int i = 0; i < recResult1.size(); i++) {
				String code = ((char)(cc1 - '1' + 'a')) + "";
				myResult.add(code + recResult1.get(i));
			}

			if (cc1 <= '2') {
				String ros2 = str.substring(2);
				char cc2 = str.charAt(1);

				if(cc2 <= '6'){
					ArrayList<String> recResult2 = getCodes(ros2);
					
					for (int i = 0; i < recResult2.size(); i++) {
						String code = ((char)((cc1 - '0') * 10 + (cc2 - '0') - 1 + 'a')) + "";
						myResult.add(code + recResult2.get(i));
					}
				}
			}
			
			return myResult;
		}

	}

}
