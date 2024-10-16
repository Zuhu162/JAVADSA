import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.ArrayList;

public class RecursiveLinearSearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {1,2,3,4,4,5,6,4};

        LinearSearch(4, arr, 0, list);
        System.out.println(list);
    }

    static ArrayList<Integer> LinearSearch(int target, int[] arr, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target) list.add(index);

        return LinearSearch(target, arr, index + 1, list);
    }
}