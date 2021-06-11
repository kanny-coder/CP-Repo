package final_450.array;

import java.util.Scanner;

public class ContigArrSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max= arr[0];
		int run_max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			run_max = Math.max(arr[i], run_max+arr[i]);
			max = Math.max(max, run_max);
		}
		System.out.println(max);
	}

}
