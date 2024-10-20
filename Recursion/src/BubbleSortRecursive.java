import java.util.Arrays;

public class BubbleSortRecursive {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 7, 2, 6, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

   static void bubbleSort(int[] arr){
       boolean swap = false;
       for (int i = 0; i < arr.length; i++) {
           for (int j = i + 1; j < arr.length; j++) {
               if(arr[i] > arr[j]){
                   swap(arr, i, j);
                   swap = true;
               }
           }
       if(!swap) break;
       }
   }

   static void recursiveBubbleSort(int[] arr, int n){
        if(n == 1) return;

       for (int i = 0; i < ; i++) {

       }
   }



   static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
   }

}