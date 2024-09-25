//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/1396522309/
public class LT33 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};

        int pivot = findPivot(nums);
        System.out.println(pivot);
    }

    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] < nums[0] && nums[mid] < nums[mid - 1]){
                return mid;
            }
            else if(nums[mid] > nums[0]){
                start = mid + 1;
            }
            else if(nums[mid] < nums[0] && nums[mid] > nums[mid - 1]){
                end = mid - 1;
            }
        }

        return -1;
    }
}