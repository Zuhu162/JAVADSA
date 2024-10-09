//https://leetcode.com/problems/search-insert-position/
public class LT35 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,8};

        int result = searchInsert(nums, 2);
        System.out.println((result));
    }

    static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        if(target > nums[high]){
            return high + 1;
        }

        while(low <= high){
            int mid = low + (high - low)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(target > nums[mid]){
                low = mid + 1;
            }
            else high = mid - 1;
        }

        return low;
    }
}