public class PatternRecursion {
    public static void main(String[] args) {
        buildPattern(5, 0);
    }

    static void buildPattern(int row, int column) {
        if(row == 0){
            return;
        }
        if(column < row){
            System.out.print("*");
            buildPattern(row, column + 1);
        }
        else {
            System.out.println();
            buildPattern(row - 1, 0);
        }
    }
}