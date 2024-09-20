//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/1396522309/
import java.util.Arrays;

public class LT34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,8,8,10};

        int[] result = searchRange(nums, 7);
        System.out.println(Arrays.toString(result));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};

        int start = search(target, nums, true);
        int end = search(target, nums, false);

        result[0] = start;
        result[1] = end;

        return result;
    }

    static int search(int target, int[] nums, boolean findStartIndex){
        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > nums[mid]){
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else {
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}