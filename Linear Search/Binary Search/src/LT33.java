//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/1396522309/
public class LT33 {
    public static void main(String[] args) {
        int[] nums = {5,1,2,3,4};

        int result = result(nums, 1);
        System.out.println(result);
    }

    static int result(int[] nums, int target){

        //Edge case - if array lengths are less than 2
        if(nums.length == 2){
            if(nums[0] == target){
                return 0;
            } else if (nums[1] == target) {
                return 1;
            }
            else return -1;
        }
        //
        if(nums.length == 1){
            if(nums[0] == target){
                return 0;
            };

            return -1;
        }

        int pivot = findPivot(nums);

        //if pivot does not exist or is the first element
        if(pivot == -1){
            return findTarget(nums, 0, nums.length - 1, target);
        }

        if(pivot == 0){
            return findTarget(nums, 1, nums.length - 1, target);
        }

        //Search First Half
        int searchFirstHalf = findTarget(nums, 0, pivot - 1, target);
        if(searchFirstHalf != -1){
            return searchFirstHalf;
        }
        //Search Second Half
        return findTarget(nums, pivot, nums.length - 1, target);
    }

    static int findTarget(int[] nums, int start, int end, int target){
        if(target == nums[0]){
            return 0;
        }

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > nums[mid]){
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else return mid;
        }

        return -1;
    }

    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            //if pivot is the first element
            if(mid == 0){
                return mid;
            }
            else if(nums[mid] < nums[0] && nums[mid] < nums[mid - 1]){
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