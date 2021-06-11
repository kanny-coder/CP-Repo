package final_450.array;

import java.util.Scanner;

public class NegOneSide {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            if (arr[left] < 0 && arr[right] < 0) left++;
            else if (arr[left] > 0 && arr[right] < 0) {
                int flag = arr[left];
                arr[left] = arr[right];
                arr[right] = flag;
                left++;
                right--;
            } else if (arr[left] > 0 && arr[right] > 0) right--;
            else {
                left++;
                right--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
