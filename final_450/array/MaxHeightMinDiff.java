package final_450.array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxHeightMinDiff {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int diff = arr[n - 1] - arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= k) {
                max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
                min = Math.min(arr[0] + k, arr[i] - k);

                diff = Math.min(diff, max - min);
            } else continue;
        }
        System.out.println(diff);
    }
}
