public class SortedArrayCheck {
    public static void main(String[] args) {
        boolean result = isSorted(new int[]{0,1,2,3,4,7,5}, 0);
        System.out.println(result);
    }

    static boolean isSorted(int[] arr, int i){
        if(i + 1 > arr.length - 1) return true;
        if(arr[i] >= arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }
}