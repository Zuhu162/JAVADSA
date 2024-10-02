import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,1,2};
        cycleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else i++;
        }

    }

    static void swap(int[] arr, int firstValue, int secondValue){
        int temp = arr[firstValue];
        arr[firstValue] = secondValue;
        arr[secondValue] = temp;
    }
}
