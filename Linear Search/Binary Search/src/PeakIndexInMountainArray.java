//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] nums = {0,3,5,12,2};

        int result = peakIndexInMountainArray(nums);
        System.out.println(result);
    }

    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid + 1] > arr[mid]){
                start = mid + 1;
            }
            else if(arr[mid - 1] > arr[mid]){
                end = mid - 1;
            }
            else return arr[mid];
        }
        return -1;
    }

}