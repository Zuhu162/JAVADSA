public class ZeroCheck {
    public static void main(String[] args) {
        int ans = checkZero(30210004, 0);
        System.out.println(ans);
    }


    static int checkZero(int n, int c){
            int count = c;

            if(n % 10 == n){
                return count;
            }

            if(n%10 == 0){
                count++;
            }

            return checkZero(n/10, count);
    }
}