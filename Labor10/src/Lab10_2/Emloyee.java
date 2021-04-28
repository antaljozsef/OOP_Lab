package Lab10_2;

public class Emloyee{
    private int ID;
    private String firstName;
    private String lastName;
    private double salary;
    private MyDate birthDate;
    private int counter;

    public Emloyee(int ID, String firstName, String lastName, double salary, MyDate birthDate, int counter) {
        this.ID = ;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.birthDate = birthDate;
        this.counter += 1;
    }

    //Get

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    //Set

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emloyee{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", counter=" + counter +
                '}';
    }
}
