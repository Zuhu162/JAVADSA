//https://leetcode.com/problems/sort-array-by-parity/
import java.util.Arrays;

public class LT922 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2,3,0,4};

        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }

    static int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            if(nums[start] % 2 == 1){
                swap(nums, start, end);
                end--;
            }
            else start++;
        }

        start = 1;
        end = nums.length - 2;

        while(start < end){
            swap(nums, start, end);
            end = end - 2;

            start = start + 2;
        }

        return nums;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
