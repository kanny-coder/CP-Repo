package final_450.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] =
                Arrays.stream(br.readLine().trim().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        br.close();
    }
}
