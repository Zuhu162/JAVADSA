//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/1396522309/
import java.util.Arrays;

public class TwoDimensionalBS {
    public static void main(String[] args) {
        int[][] sortedArray = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[] result = twoDimensionalSearch(sortedArray, 16);

        System.out.println(Arrays.toString(result));

    }


    static int[] twoDimensionalSearch(int[][] sortedArray, int target) {
        int row = 0;
        int col = sortedArray.length - 1;

        while (row < sortedArray.length && col >= 0) {
            if (sortedArray[row][col] == target) {
                return new int[]{row, col};
            }
            if (sortedArray[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }

        return new int[]{-1, -1};
    }
}