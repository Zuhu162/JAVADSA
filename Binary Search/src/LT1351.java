//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/1396522309/
import java.util.Arrays;

public class LT1351 {
    public static void main(String[] args) {
        int[][] sortedArray = {
                {5,1,0},
                {-5,-5,-5}
        };

        int result = countNegatives(sortedArray);

        System.out.println(result);

    }


    static int countNegatives(int[][] grid) {
        int row = 0;
        int col = grid[0].length - 1;

        int negCount = 0;

        while(row < grid.length && col >= 0){
            int pointer = grid[row][col];
            if(pointer < 0){
                negCount += grid.length - row;
                col--;
            }
            else {
                row++;
            }
        }

        return negCount;
    }
}

