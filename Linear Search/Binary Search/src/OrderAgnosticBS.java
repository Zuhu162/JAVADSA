public class OrderAgnosticBS {
    public static void main(String[] args){
        int[] ascArray = {0,1,2,3,4,5,6,7,8,9,10};
        int[] descArray =  {10,9,8,7,6,5,4,3,2,1,0};

        int result1 = orderAgnosticBS(ascArray, 6);
        int result2 = orderAgnosticBS(descArray, 1);

        System.out.println(result2);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;


        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else end = mid - 1;
            }
            else  {
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else start = mid + 1;
            }
        }
        return -1;
    }
}



