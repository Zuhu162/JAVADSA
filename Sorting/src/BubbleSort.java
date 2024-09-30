import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90                                                                                                           };
        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swap = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
}
