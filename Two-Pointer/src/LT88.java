//https://leetcode.com/problems/merge-sorted-array/description/
import java.util.Arrays;

public class LT88 {
    public static void main(String[] args) {
        int[] nums1 = {3,5,6,0,0,0};
        int[] nums2 = {1,2,4};

        merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0){
            if(nums2[j] >= nums1[i]){
                nums1[k] = nums2[j];
                j--;
            }
            else {
                nums1[k] = nums1[i];
                nums1[i] = 0;
                i--;
            }
            k--;
        }

        while(j >= 0){
            nums1[j] = nums2[j];
            i--;
            j--;
        }
    }
}