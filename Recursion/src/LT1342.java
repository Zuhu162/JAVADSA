public class LT1342 {
    public static void main(String[] args) {
        int ans = numberOfSteps(12);
        System.out.println(ans);
    }

    static int numberOfSteps(int num) {
        return helper(num, 0);
    }


    static int helper(int num, int count){
        int c = count;

        if(num == 0){
            return c;
        }

        c++;

        if(num % 2 == 0){
            return helper(num/2, c);
        }
        else return helper(num - 1, c);
    }
}