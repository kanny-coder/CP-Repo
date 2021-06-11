package final_450.array;

import java.util.Scanner;

public class ArrayRotateByOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
		}
		
		int flag = arr[n-1];
		for (int i = n-1; i >0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0]= flag;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
