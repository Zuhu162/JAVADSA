public class LT442 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};

        int result = recursiveFunction(nums, 1);
        System.out.println(result);
    }

    static int recursiveFunction(int[] nums, int target){
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                counter++;
            }
            if(counter > 1){
                return nums[i];
            }
        }

        return recursiveFunction(nums, target + 1);
    }

}
