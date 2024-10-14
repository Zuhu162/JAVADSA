import java.util.Arrays;

public class LT1346 {
    public static void main(String[] args) {
        int[] arr  = {-10,12,-20,-8,15};
        boolean ans = checkIfExist(arr);
        System.out.println(ans);
    }


    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++){
            if (binarySearch(arr[i] * 2, arr, i + 1)) return true;
            if (arr[i] % 2 == 0 && binarySearch(arr[i] / 2, arr, i + 1)) return true;
        }
        
        return false;
    }


    static boolean binarySearch(int target, int[] arr, int s){
        int start = s;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else return true;
        }

        return false;
    }
}