import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name){
        this.name = name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }


}
