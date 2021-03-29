public class Matrix {
    private double[][] data;
    private final int rows;
    private final int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[this.rows][this.columns];
    }

    public Matrix(double[][] data) {
        this.rows = data.length;
        this.columns = data[0].length;
        this.data = new double[this.rows][this.columns];

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; i++) {
                this.data[i][j] = data[i][j];
            }
        }
    }

    public Matrix(Matrix data) {
        this.rows = data.getRows();
        this.columns = data.getColumns();
        this.data = new double[this.rows][this.columns];

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; i++) {
                this.data[i][j] = data.getData()[i][j];
            }
        }
    }

    public void fillRandom(double a, double b) {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.data[i][j] = Math.random() * (b - a + 1) + a;
            }
        }
    }

    //Getter

    public int getRows() {
        return this.rows;
    }

    public int getColumns() {
        return this.columns;
    }

    public double[][] getData() {
        return this.data;
    }

    //Other methods

    public void printMatrix() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.print(String.format("%.2f \t",this.data[i][j]));
            }
            System.out.print("\n");
        }
    }

    public static Matrix add(Matrix m1, Matrix m2) {
        if (m1.rows != m2.rows || m1.columns != m2.columns) {
            System.out.println("Nem lehet osszeadni!");
            return null;
        }

        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m1.columns; j++) {
                m1.getData()[i][j] += m2.getData()[i][j];
            }
        }

        return m1;
    }

    public static Matrix multiply(Matrix m1, Matrix m2) {
        if (m1.columns != m2.rows) {
            System.out.println("Nem lehet osszeszororzni!");
            return null;
        }

        Matrix m3 = new Matrix(m1.rows, m2.columns);

        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m1.columns; j++) {
                for (int k = 0; k < m1.columns; k++) {
                    m3.getData()[i][j] += m1.getData()[i][k] * m2.getData()[k][j];
                }
            }
        }

        return m3;
    }

    public static Matrix transpose(Matrix m) {
        Matrix n = new Matrix(m.columns, m.rows);

        for (int i = 0; i < n.rows; i++) {
            for (int j = 0; j < n.columns; j++) {
                n.getData()[i][j] = m.getData()[j][i];
            }
        }
        return n;
    }
}

