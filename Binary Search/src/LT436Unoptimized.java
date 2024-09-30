//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/1396522309/
import java.util.Arrays;

public class LT436Unoptimized {
    public static void main(String[] args) {
        int[][] arr = {
                {4,4}
        };

        int[] result = findRightInterval(arr);

        System.out.println(Arrays.toString(result));

    }


    static int[] findRightInterval(int[][] intervals) {
        int row = 0;
        int col = intervals[row].length - 1;
        int checkRow = row;

        int[] result = new int[intervals.length];

        int rightInt = -1;
        boolean found = false;

        while(row < intervals.length){

            if(intervals[row][1] > intervals[checkRow][0]){
                checkRow++;
            }
            else {
                if(!found){
                    found = true;
                    rightInt = checkRow;
                }
                else {
                    if(intervals[checkRow][0] < intervals[rightInt][0]){
                        rightInt = checkRow;
                    }
                }
                result[row] = rightInt;
                checkRow++;
            }


            if(checkRow > intervals.length - 1){
                result[row] = rightInt;
                row++;
                rightInt = -1;
                checkRow = 0;
                found = false;
            }
        }

        return result;
    }
}