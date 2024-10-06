public class LT169 {
    public static void main(String[] args) {
        int[] arr = {8,8,7,7,7};
        int majorityElement = majorityElement(arr);

        System.out.println(majorityElement);
    }

    static public int majorityElement(int[] nums) {
        int current = 0;
        int target = nums[current];
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                count++;
            }
            if(count > nums.length / 2){
                return target;
            }
            if(count <= nums.length/2 && i == nums.length - 1){
                current++;
                target = nums[current];
                i = 0;
                count = 0;
            }
        }

        return target;
    }
}
