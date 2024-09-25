//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/1396522309/
public class LT33BetterSolution {
    public static void main(String[] args) {
        int[] nums = {5,1,2,3,4};

        int result = search(nums, 1);
        System.out.println(result);
    }

    public static int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            // If the target is found, return the index
            if (nums[mid] == target) {
                return mid;
            }

            // Check if the left half is sorted
            if (nums[s] <= nums[mid]) {
                // If target lies within the left half
                if (target >= nums[s] && target < nums[mid]) {
                    e = mid - 1;
                } else { // Otherwise, search in the right half
                    s = mid + 1;
                }
            }
            // If the left half is not sorted, the right half must be sorted
            else {
                // If target lies within the right half
                if (target > nums[mid] && target <= nums[e]) {
                    s = mid + 1;
                } else { // Otherwise, search in the left half
                    e = mid - 1;
                }
            }
        }

        // If target is not found, return -1
        return -1;
    }
}