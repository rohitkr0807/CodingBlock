package asgn8a;

import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = scn.nextInt();
		}
		
		System.out.println(countSplit(arr, 0, 0, 0));
		printSplit(arr, 0, 0, 0, "Start", "Start");
		System.out.println(getSplit(arr, 0, 0, 0, "Start", "Start"));
	}
	
	public static int countSplit(int[] arr, int si, int sg1, int sg2){
		if(si == arr.length){
			if(sg1 == sg2){
				return 1;
			} else {
				return 0;
			}
		}
		
		int count = 0;
		
		count += countSplit(arr, si + 1, sg1 + arr[si], sg2);
		count += countSplit(arr, si + 1, sg1, sg2 + arr[si]);
		
		return count;
	}
	
	public static void printSplit(int[] arr, int si, int sg1, int sg2, String osf1, String osf2){
		if(si == arr.length){
			if(sg1 == sg2){
				System.out.println(osf1 + " and " + osf2);
				return;
			} else {
				return;
			}
		}
		
		printSplit(arr, si + 1, sg1 + arr[si], sg2, osf1 + ", " + arr[si], osf2);
		printSplit(arr, si + 1, sg1, sg2 + arr[si], osf1, osf2 + ", " + arr[si]);
	}

	public static ArrayList<String> getSplit(int[] arr, int si, int sg1, int sg2, String osf1, String osf2){
		if(si == arr.length){
			ArrayList<String> baseResult = new ArrayList<>();
			
			if(sg1 == sg2){
				baseResult.add("\n" + osf1 + " and " + osf2 + "\n");
			} else {
				// nothing
			}
			
			return baseResult;
		}
		
		ArrayList<String> recResult = null, myResult = new ArrayList<>();
		
		recResult = getSplit(arr, si + 1, sg1 + arr[si], sg2, osf1 + ", " + arr[si], osf2);
		myResult.addAll(recResult);
		
		recResult = getSplit(arr, si + 1, sg1, sg2 + arr[si], osf1, osf2 + ", " + arr[si]);
		myResult.addAll(recResult);
		
		return myResult;
	}
}
