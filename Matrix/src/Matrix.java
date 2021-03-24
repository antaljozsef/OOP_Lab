public class Matrix {
    private double[] data[];
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    //public Matrix(double[][]){}
    //public Matrix(Matrix){}

    public int getRows() {
        return this.rows;
    }

    public int getColumns() {
        return this.columns;
    }

    public void printMatrix() {
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.print("\n");
        }
    }


}
