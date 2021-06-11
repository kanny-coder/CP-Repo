package final_450.array;

import java.util.Arrays;
import java.util.Scanner;

public class Merge2SortedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		int i = n-1;
        int j = 0;
        while(j<m && i>=0){
            if(arr1[i]>arr2[j]){
                
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                
            }
            j++;
            i--;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for (int j2 = 0; j2 < arr1.length; j2++) {
			System.out.print(arr1[j2]+" ");
		}
        for (int j2 = 0; j2 < arr2.length; j2++) {
			System.out.print(arr2[j2]+" ");
		}
        sc.close();

	}

}
