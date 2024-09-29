//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class RotationCountInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {15, 18, 2, 3, 6, 12};
        int[] arr2 = {7, 9, 11, 12, 5};
        int[] arr3 = {7, 9, 11, 12, 15};

        System.out.println(findRotations(arr1)); // Output: 2
        System.out.println(findRotations(arr2)); // Output: 4
        System.out.println(findRotations(arr3)); // Output: 0
    }

    static int findRotations(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;


            if(mid > 0 && arr[mid] < arr[mid - 1]){
                return mid;
            }
            else if(arr[mid] > arr[arr.length - 1]){
                start = mid + 1;
            }
            else end = mid - 1;
        }
        return 0;
    }
}