//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/1396522309/
public class LT34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};

        int[] result = searchRange(nums, 8);
        System.out.println(result);
    }

    static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int[] result = {-1,-1};
        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == nums[mid]){
                while(target == nums[mid]){
                    mid--;
                }
                result[0] = mid + 1;
                break;
            }

            else if(target >= nums[mid]) {
                start = mid + 1;
            }
            else end = mid - 1;
        }
        return result;
    }
}