package Lab10_2;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Emag");
        company.hireAll("be.csv");

        company.printAll(System.out);

        System.out.println("\n\n");

        company.printManangers(System.out);
    }
}
