public class Main {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,6,7,8,9,10};

        int result = LinearSearch(nums, 11);
        System.out.println(result);
    }

    static int LinearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}