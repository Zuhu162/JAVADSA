public class DigitProduct {
    public static void main(String[] args) {
        int ans = findDigitSum(255);
        System.out.println(ans);
    }

    static int findDigitSum(int n){
            if(n % 10 == n){
                return n;
            }

            return n%10 * findDigitSum(n/10);
    }
}