public class ReverseNumber {
    static int number;

    public static void main(String[] args) {
        System.out.println(reverse2(2525)); //5252 => 500 + 200 + 20 + 5
    }

    static void reverse(int n){
            if(n == 0){
                return;
            }

            int remainder = n % 10;
            number = number * 10 + remainder;
            reverse(n/10);

    }

    static int reverse2(int n){
        int digits = (int) (Math.log10(n)) + 1;
        return reverse2Helper(n, digits);
    }

    static int reverse2Helper(int n, int digits){
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10; //2525 % 10 = 5

        return  rem * (int)(Math.pow(10, digits - 1)) + reverse2Helper(n/10, digits - 1);
    }
}