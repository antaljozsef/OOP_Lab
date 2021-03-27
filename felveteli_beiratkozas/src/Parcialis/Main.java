package Parcialis;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Informatika informatika = new Informatika();

        Diak diak1 = new Diak("Mezei", "Maria", 7.56, 8.78);
        Diak diak2 = new Diak("Asztalos", "Imre", 8.45, 7.25);

        informatika.ujBeiratkozo(diak1);
        informatika.ujBeiratkozo(diak2);

        informatika.listazOsszes();

        System.out.println("**********************************");

        ArrayList<Diak> diak = readFromFile("import.txt");
        for (Diak d: diak) {
            informatika.ujBeiratkozo(d);
        }

        informatika.listazOsszes();

        System.out.println("**********************************");

        System.out.println("\nA 8-as atlag felett levo diakok:\n");
        informatika.listazAtlag(8.0);

        System.out.println("*****************************");

        System.out.println("\nA felvetelizok Szama:" + informatika.felvetelizokSzama());
        System.out.println("A felvetelizok Atlaga: " + informatika.felvetelizokAtlaga());

    }

    public static ArrayList<Diak> readFromFile(String fileName){
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ArrayList<Diak> diak = new ArrayList<>();

        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();

            String[] items = line.split(" ");

            diak.add(new Diak(items[0].trim() , items[1].trim(), Double.parseDouble(items[2]), Double.parseDouble(items[3])));
        }

        return diak;
    }
}
