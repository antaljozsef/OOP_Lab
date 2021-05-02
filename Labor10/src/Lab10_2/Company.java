package Lab10_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Company{

    private String name;
    private ArrayList<Emloyee> emloyees;

    public Company(String name) {
        this.name = name;
        this.emloyees = new ArrayList<>();
    }

    //Get

    public String getName() {
        return name;
    }

    //Set

    public void setName(String name) {
        this.name = name;
    }

    //Other

    public void hire(Emloyee emloyee)
    {
        this.emloyees.add(emloyee);
    }

    public void hireAll(String filename)
    {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File(filename));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        while (scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            if (line.isEmpty())
            {
                continue;
            }

            String[] items = line.trim().split(", ");

            Emloyee emp = null;
            boolean mananger = false;
            try {
                if (items[6] != null)
                {
                    mananger = true;
                }
            }catch (IndexOutOfBoundsException e){}

            if (mananger)
            {
                emp = new Manager(items[0],items[1],Double.parseDouble(items[2]),new MyDate(Integer.parseInt(items[3]),Integer.parseInt(items[4]),Integer.parseInt(items[5])),items[6]);
            }
            else {
                emp = new Emloyee(items[0],items[1],Double.parseDouble(items[2]),new MyDate(Integer.parseInt(items[3]),Integer.parseInt(items[4]),Integer.parseInt(items[5])));
            }

            this.hire(emp);
        }
    }

    public void fire(int ID)
    {
        this.emloyees.remove(ID);
    }

    public void printAll(PrintStream printStream)
    {
        for (Emloyee emloyee : this.emloyees)
        {
            printStream.println(emloyee);
        }
    }

    public void printManangers(PrintStream printStream)
    {
        for (Emloyee emloyee : this.emloyees)
        {
            if (emloyee instanceof Manager)
            {
                printStream.println(emloyee);
            }
        }
    }
}
