package final_450.array;

import java.util.*;


public class MergeIntervals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int[][] arr = new int[rows][cols];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int[][] ans = MergeInt(arr);
		for (int i = 0; i < ans[0].length; i++) {
			for (int j = 0; j < ans[1].length; j++) {
				System.out.print(ans[i][j]+" ");
			}
		}
		
//		displaying input
//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < cols; j++) {
//				System.out.print(arr[i][j]+ " ");
//			}
//			System.out.println();
//		}
		
		
//		for (int i = 1; i < list.size(); i+=2) {
//			if()
//		}

	}

	private static int[][] MergeInt(int[][] arr) {
		if(arr.length<=1)	return arr;
		Arrays.sort(arr,(a,b)->Integer.compare(a[0], b[0]));
		
		List<int[]> output_arr = new ArrayList();
		int[] current_int = arr[0];
		output_arr.add(current_int);
		
		for(int[] interval:arr) {
			int current_begin = current_int[0];
			int current_end = current_int[1];
			int next_begin = interval[0];
			int next_end = interval[1];
			
			if(current_end>=next_begin) {
				current_int[1] = Math.max(current_end, next_end);
			}else {
				current_int = interval;
				output_arr.add(current_int);
			}
		}
		return output_arr.toArray(new int[output_arr.size()][]);
	}

}
