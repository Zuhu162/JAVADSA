import java.util.ArrayList;
import java.util.List;

public class LT287 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

        ArrayList<Integer> numsList = (ArrayList<Integer>) cyclicSort(arr);
        System.out.println(numsList);
    }

    static List<Integer> cyclicSort(int[] nums){
        ArrayList<Integer> numsList = new ArrayList<Integer>();

        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;

            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else
                i++;
        }

        for(i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                numsList.add(i + 1);
            }
        }

        return numsList;

    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
