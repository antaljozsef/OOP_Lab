package Lab10_2;

public class Manager extends Emloyee{

    private String department;

    public Manager(String firstName, String lastName, double salary, MyDate birthDate, String department) {
        super(firstName, lastName, salary, birthDate);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    //Set

    public void setDepartment(String department) {
        this.department = department;
    }
}
