import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LT905 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

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

        return nums;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
