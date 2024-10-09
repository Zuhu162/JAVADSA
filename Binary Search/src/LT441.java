//https://leetcode.com/problems/arranging-coins/description/

public class LT441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(1804289383));
    }

    static int arrangeCoins(int n) {
        long low = 0, high = n;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long curr = mid * (mid + 1) / 2; // Sum of first 'mid' natural numbers

            if (curr == n) {
                return (int) mid;  // Found exact match
            } else if (curr < n) {
                low = mid + 1;  // Try higher
            } else {
                high = mid - 1;  // Try lower
            }
        }
        return (int) high;
    }
}