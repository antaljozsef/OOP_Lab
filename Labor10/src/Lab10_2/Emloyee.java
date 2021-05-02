package Lab10_2;

public class Emloyee implements Comparable<Emloyee>{
    private final int ID;
    private String firstName;
    private String lastName;
    private double salary;
    private MyDate birthDate;
    private static int counter = 1;

    public Emloyee(String firstName, String lastName, double salary, MyDate birthDate) {
        this.ID = counter;
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

    public MyDate getBirthDate() {
        return birthDate;
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setBirthDate(MyDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    //Other

    @Override
    public String toString() {
        return "ID: " + this.ID + "\n" +this.firstName + "\n" + this.lastName + "\n" + this.salary + "\n" + this.birthDate;
    }

    @Override
    public int compareTo(Emloyee o) {
        String thisName = this.lastName + this.firstName;
        String oName = o.lastName + o.firstName;

        return thisName.compareTo(oName);
    }
}
