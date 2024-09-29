//https://leetcode.com/problems/sqrtx/description/

public class LT69 {
    public static void main(String[] args) {

        int result = mySqrt(2147395599);
        System.out.println((result));
    }

    static int mySqrt(int x) {
        int start = 2;
        int end = x;

        while(start <= end){
            int mid = start + (end - start) / 2;
            long midSqr = (long) mid * mid;

            if(midSqr > x){
                end = mid - 1;
            }
            else if(midSqr < x){
                start = mid + 1;
            }
            else return mid;
        }

        return end;
    }
}