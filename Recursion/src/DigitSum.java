public class DigitSum {
    public static void main(String[] args) {
        int ans = findDigitSum(255);
        System.out.println(ans);
    }

    static int findDigitSum(int n){
            if(n == 0){
                return 0;
            }

            return n%10 + findDigitSum(n/10);
    }
}