import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90 };
        select(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void select(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length -1 - i;
            int highestIndex = findHighest(arr, 0, last);
            swap(arr, highestIndex, last);
        }
    }

    static int findHighest(int[] arr, int start, int end){
        int highest = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[highest]){
                highest = i;
            }
        }
        return highest;
    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
