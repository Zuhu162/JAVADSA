public class PatternRecursion {
    public static void main(String[] args) {
        buildPattern(5);
    }

    static void buildPattern(int rows) {
        if(rows == 1){
            System.out.print("*");
            return;
        }

        for (int i = 0; i < rows; i++) {
            System.out.print("*");

        }
        System.out.println("");

        buildPattern(rows - 1);
    }
}