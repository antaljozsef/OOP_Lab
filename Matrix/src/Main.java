public class Main {
    public static void main(String[] args) {
        Matrix a = new Matrix(2,3);
        a.fillRandom(1,2);

        System.out.println("a rows: " + a.getRows()+", cols: " + a.getColumns());
        System.out.println("a: ");
        a.printMatrix();
        System.out.println();

        Matrix b = new Matrix(2,3);
        b.fillRandom(1,2);
        System.out.println("b: ");
        b.printMatrix();
        System.out.println();

        Matrix c = new Matrix(2, 3);
        c.fillRandom(1,2);
        System.out.println("c: ");
        c.printMatrix();
        System.out.println("\nSum: b + c");
        Matrix.add(b, c).printMatrix();

        Matrix d = new Matrix(3, 4);
        d.fillRandom(0, 1);
        System.out.println("d: ");
        d.printMatrix();

        System.out.println("\nProduct: b * d");
        Matrix.multiply(b, d).printMatrix();

        System.out.println("\nTranspose(d)");
        Matrix.transpose(d).printMatrix();
    }
}
