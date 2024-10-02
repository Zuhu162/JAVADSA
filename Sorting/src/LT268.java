import java.util.Arrays;

public class LT268 {
    public static void main(String[] args) {
        int[] arr = {0,9,8,7,6,5,4,3,1,2};
        int missing = missingNumber(arr);

        System.out.println(missing);
    }

    static int missingNumber(int[] nums) {
        int i = 0;

        while(i < nums.length){
            if(nums[i] != i && nums[i] < nums.length){
                swap(nums, i, nums[i]);
            }
            else i++;
        }

        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j){
                return j;
            }
        }

        return nums.length;
    }

    static void swap(int nums[], int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
