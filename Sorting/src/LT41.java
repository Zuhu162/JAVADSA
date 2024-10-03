//https://leetcode.com/problems/first-missing-positive/description/
import java.util.Arrays;

public class LT41 {
    public static void main(String[] args) {
        int[] arr = {1};

        int result = firstMissingPositive(arr);
        System.out.println(result);
    }

    static int firstMissingPositive(int[] nums){
        int i = 0;

        while(i < nums.length){
            int correctIndex = nums[i] - 1;

            if(nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else i++;
        }

        for(i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                return i + 1;
            }
        }

        return nums.length + 1;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
