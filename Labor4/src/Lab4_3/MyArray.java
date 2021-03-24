package Lab4_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class MyArray {
    private final int length;
    private final double[] elements;

    public MyArray(int length) {
        this.length = length;
        this.elements = new double[this.length];
    }

    public MyArray(MyArray array) {
        this.length = array.length;
        this.elements = array.elements;
    }

    public MyArray(double[] array) {
        this.length = array.length;
        this.elements = array;
    }

    public MyArray(String fileName) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (scanner == null) {
            this.length = 0;
            this.elements = null;
        } else {

            this.length = Integer.parseInt(scanner.nextLine());
            this.elements = new double[this.length];

            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                String[] items = line.split(" ");

                String[] items = scanner.nextLine().split(" ");

                for (int i = 0; i < this.length; i++) {
                    this.elements[i] = Double.parseDouble(items[i]);
                }
            }
            scanner.close();
        }
    }

    public int getLength() {
        return this.length;
    }

    public double[] getElements() {
        return this.elements;
    }

    @Override

    public String toString() {
        StringBuilder str = new StringBuilder();

        for (double d : this.elements) {
            str.append(String.format("%.2f", d)).append(" ");
        }
        return str.toString();
    }

    public void fillRandom(int a, int b) {
        Random random = new Random();

        for (int i = 0; i < this.length; i++)
            this.elements[i] = (double) (random.nextInt(b - a) + a) / (random.nextInt(b - a) + a + 1);
    }

    public double mean() {
        double sum = 0;
        for (double e : this.elements)
            sum += e;

        return sum / this.length;
    }

    public double stddev() {
        double standardDeviation = 0;

        double nean = this.mean();

        for (double nun : this.elements) {
            standardDeviation += Math.pow(nun - nean, 2);
        }
        return Math.sqrt(standardDeviation / this.length);
    }

    public void sort() {
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.length - 1; j++) {
                if (this.elements[j] > this.elements[j + 1]) {
                    double tmp = this.elements[j];
                    this.elements[j] = this.elements[j + 1];
                    this.elements[j + 1] = tmp;
                }
            }
        }
    }
}