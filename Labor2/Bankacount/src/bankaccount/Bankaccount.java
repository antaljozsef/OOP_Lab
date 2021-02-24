package bankaccount;

public class Bankaccount {

    //Attributes -> tulajdonsagok
    private double balance;//egysegbezaras -> encapsulation
    public double money;
    private String accountNumber;


    //Methods -> viselkedesek

    ///Constructor
    ///inicializalas, lefoglalas

    public Bankaccount() {

        this.balance = 0;
    }

    public Bankaccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public Bankaccount(double balance) {

        this.balance = balance;
    }

    public boolean putIn(double money) {
        if (money >= 0) {
            balance += money;
            return true;
        }
        return false;
    }

    public boolean takeOut(double money) {
        if (balance >= money) {
            balance -= money;
            return true;
        }
        return false;
    }

    //Getters
    public double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    //Setters

    /**
     * public void setBalance(double money){
     * this.balance += money;
     * }money
     */


    public void setAccountNumber(String accountNumber) {

        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {

        //felepitjuk a kimenetet
        //Bank account: ......, balance: ......;

        return "Bank account: " + this.accountNumber + " Balance: " + this.balance;
        //return String.format("Bank account %f", this.balance);
    }
}
