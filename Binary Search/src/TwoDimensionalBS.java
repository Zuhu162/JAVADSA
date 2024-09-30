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

//int row = 0;
//        int col = intervals[row].length - 1;
//        int checkRow = row + 1;
//
//        int[] result = new int[intervals.length];
//
//        if(intervals.length < 2){
//            int[] resultNew = {-1};
//            return resultNew;
//        }
//
//        int rightInt = -1;
//        boolean found = false;
//
//        while(row < intervals.length){
//
//            if(intervals[row][col] > intervals[checkRow][0]){
//                checkRow++;
//            }
//            else {
//                if(!found){
//                    found = true;
//                    rightInt = checkRow;
//                }
//                else {
//                    if(intervals[row][col] < intervals[rightInt][0]){
//                        rightInt = row;
//                    }
//                }
//                result[row] = rightInt;
//                checkRow++;
//            }
//
//
//            if(checkRow > intervals.length - 1){
//                result[row] = rightInt;
//                row++;
//                rightInt = -1;
//                checkRow = 0;
//                found = false;
//            }
//        }
//
//        return result;
//    }