public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {0,10,20,30,40,50,60,70,80,90};

        int result = binarySearch(arr, 70);
        System.out.println((result));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;


        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
        }
        return -1;
    }
}