//https://leetcode.com/problems/binary-search/description/
public class LT704 {

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(search(nums,  9));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target == nums[mid]){
                return mid;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else end = mid - 1;
        }

        return -1;
    }
}
