//https://leetcode.com/problems/single-element-in-a-sorted-array/

public class LT540 {
    public static void main(String[] args) {

        int[] nums = {1,1,2,3,3,4,4,8,8};
        int result = singleNonDuplicate(nums);
        System.out.println((result));
    }

    static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            //Check if mid is an even index. Because all Dupicate number's first occurence should be in an even index.
            if(mid % 2 == 1){
                mid = mid - 1;
            }

            if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]){
                return nums[mid];
            }

            //Check the right hand side of the index.
            //If it is the same that means that left side of the array does not have the single digit as even
            if(nums[mid] == nums[mid + 1]){
                start = mid + 2;
            }
            else end = mid;
        }

        return nums[start];
    }
}