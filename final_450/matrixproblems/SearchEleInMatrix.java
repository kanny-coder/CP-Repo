package final_450.matrixproblems;

import java.util.Scanner;

public class SearchEleInMatrix {
    private static boolean SearchMatrix(int[][] matrix, int ele, int row, int col) {
        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix.length - 1;

            if (matrix[i][end] == ele || matrix[i][start] == ele) {
                return true;
            }
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (matrix[i][mid] == ele) {
                    return true;
                } else if (matrix[i][mid] < ele) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        System.out.println("Enter target to search: ");
        int ele = sc.nextInt();

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println(SearchMatrix(matrix, ele, row, col));
        sc.close();
    }
}
