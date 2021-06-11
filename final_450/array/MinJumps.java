package final_450.array;

import java.util.Scanner;

public class MinJumps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minJumps(arr, n));
        sc.close();
    }

    private static int minJumps(int[] arr, int n) {
        int curr = 0;
        int jump = 0;
        int reach = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (i + arr[i] > reach) reach = arr[i] + i;
            if (reach == i) return -1;
            if (i == curr) {
                jump++;
                curr = reach;
            }
        }
        return jump;

        //		int count = 0;
        //		int i = 0;
        //		int zero = -1;
        //		for (int j = 0; j < arr.length; j++) {
        //			if(arr[j]==0) {
        //				zero = j;
        //				break;
        //			}
        //
        //		}
        //		while(i<=(n-1)){
        //			if(zero>-1) {
        //				if(i>=zero)	break;
        //				i += arr[i];
        //				count++;
        //			}
        //			else {
        //				i += arr[i];
        //				count++;
        //			}
        //
        //		}
        //		if(zero>-1)	return count-1;
        //		return count;
    }
}
