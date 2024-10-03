//https://leetcode.com/problems/set-mismatch/description/
import java.util.Arrays;

public class LT645 {
    public static void main(String[] args) {
        int[] arr = {3,2,2};

        int[] result = cyclicSort(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] cyclicSort(int[] nums){
        int[] result = new int[2];

        int i =  0;

        while(i < nums.length){
            int correctIndex = nums[i] - 1;;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else i++;
        }

        for(i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                result[0] = nums[i];
                result[1] = i + 1;
            }
        }

        return result;

    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
