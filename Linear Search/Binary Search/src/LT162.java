//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class LT162 {
    public static void main(String[] args) {
        int[] nums = {2};

        int result = peakIndexInMountainArray(nums);
        System.out.println(result);
    }

    static int peakIndexInMountainArray(int[] nums){
        int start = 0;
        int end = nums.length - 1;



        while(start <= end){
            int mid = start + (end - start) / 2;

            if (mid + 1 < nums.length && nums[mid + 1] > nums[mid]){
                start = mid + 1;
            }
            else if(mid - 1 >= 0 && nums[mid - 1] > nums[mid]){
                end = mid - 1;
            }
            else return mid;
        }
        return -1;
    }

}