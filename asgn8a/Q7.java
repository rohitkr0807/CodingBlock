package asgn8a;

import java.util.ArrayList;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = scn.nextInt();
		}
		
		int tar = scn.nextInt();
		
		System.out.println(countSubsets(arr, 0, tar));
		printSubsets(arr, 0, tar, new boolean[arr.length]);
		System.out.println(getSubsets(arr, 0, tar));
	}
	
	public static int countSubsets(int[] arr, int si, int sum){
		if(si == arr.length){
			if(sum == 0){
				return 1;
			} else {
				return 0;
			}
		}
		
		int count = 0;
		
		count += countSubsets(arr, si + 1, sum - arr[si]);
		count += countSubsets(arr, si + 1, sum);
		
		return count;
	}

	public static void printSubsets(int[] arr, int si, int sum, boolean[] selected){
		if(si == arr.length){
			if(sum == 0){
				for(int i = 0; i < arr.length; i++){
					if(selected[i]){
						System.out.print(arr[i] + ", ");
					}
				}
				
				System.out.println("END");
			} else {
				// nothing
			}
			
			return;
		}
		
		selected[si] = true;
		printSubsets(arr, si + 1, sum - arr[si], selected);
		selected[si] = false;
		
		printSubsets(arr, si + 1, sum, selected);
	}

	public static ArrayList<ArrayList<Integer>> getSubsets(int[] arr, int si, int sum){
		if(si == arr.length){
			ArrayList<ArrayList<Integer>> baseResult = new ArrayList<>();
			
			if(sum == 0){
				baseResult.add(new ArrayList<>());
			}
			
			return baseResult;
		}
		
		ArrayList<ArrayList<Integer>> myResult = new ArrayList<>();
		ArrayList<ArrayList<Integer>> recResult = getSubsets(arr, si + 1, sum);
		
		myResult.addAll(recResult);
		
		recResult = getSubsets(arr, si + 1, sum - arr[si]);
		for(int i = 0; i < recResult.size(); i++){
			ArrayList<Integer> forMyResult = new ArrayList<>();
			forMyResult.addAll(recResult.get(i));
			forMyResult.add(arr[si]);
			
			myResult.add(forMyResult);
		}
		
		return myResult;
	}
}
