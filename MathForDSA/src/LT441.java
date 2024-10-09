//https://leetcode.com/problems/arranging-coins/description/

public class LT441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(13));
    }

    static int arrangeCoins(int n) {
        long low = 0, high = n;

        while(low <= high){
            long mid = low + (high - low)/2;
            long sumOfMid = mid * (mid - 1)/2; //Formula for finding sum of numbers till n;

            if(n == (int) sumOfMid){
                return (int) mid;
            }
            else if(sumOfMid > n){
                high = mid - 1;
            }
            else low = mid + 1;
        }

        return (int) high;
    }
}