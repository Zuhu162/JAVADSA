public class PatternRecursion {
    public static void main(String[] args) {
        buildPattern2(5, 0);
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

    static void buildPattern2(int row, int column) {
        if(row == 0){
            return;
        }
        if(column < row){
            buildPattern2(row, column + 1);
            System.out.print("*");
        }
        else {
            buildPattern2(row - 1, 0);
            System.out.println();
        }
    }
}