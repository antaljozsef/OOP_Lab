package Lab4_1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {

        //readFilePrintItsLineNumbered("gyumolcs.txt");

        Person person1 = new Person("Antal", "Jozsef", 2001);
        Person person2 = new Person("Bartha", "Tibor", 2001);
        Person person3 = new Person("Miklo", "Jozsef", 2001);
        Person person4 = new Person("Kiraly", "David", 2001);
        Person person5 = new Person("Simon", "Hunor", 2001);
        Person person6 = new Person("Patka", "Richard", 2001);

        ArrayList<Person> automatizalasA = new ArrayList<>();
        automatizalasA.add(person1);
        automatizalasA.add(person2);
        automatizalasA.add(person3);
        automatizalasA.add(person4);
        automatizalasA.add(person5);
        automatizalasA.add(person6);

        for (Person i : automatizalasA) {
            System.out.println(i);
        }

        for (int i = 0; i < automatizalasA.size(); ++i) {
            System.out.println(automatizalasA.get(i));
        }

        ArrayList<Person> persons = readFromCSVFile("people.csv");

        for (Person i : persons) {
            System.out.println(i);
        }
    }

    public static void readFilePrintItsLineNumbered(String fileName) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (scanner != null) {
            int i = 1;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(i + " " + line);
                i++;
            }
        }

        scanner.close();
    }

    public static ArrayList<Person> readFromCSVFile(String fileName) {
        // Open the file
        // ...
        // Read data from file

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<Person> persons = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                continue;
            }
            String[] items = line.split(",");
            // trim: eliminates leading and trailing spaces
            String firstName = items[0].trim();
            String lastName = items[1].trim();
            // Convert String → int: Integer.parseInt( String)
            int birtYear = Integer.parseInt(items[2].trim());
            persons.add(new Person(firstName, lastName, birtYear));
        }
        return persons;
    }
}