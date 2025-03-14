
public class LT67 {
    public static void main(String[] args) {
        long number = 2147483647;
        int num = (int) number;

        int[] nuns = {1,2,3,4,0,0,0};
        System.out.println(nuns.length);
    }

    static boolean isPerfectSquare(int num) {
        long start = 1;
        long end = num;

        while(start <= end){
            long mid = start + (end - start) / 2;

            if(mid * mid == num){
                return true;
            }
            else if(mid * mid > num){
                end = mid - 1;
            }
            else start = mid + 1;

        }

        return false;
    }
}