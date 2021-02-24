package bankaccount;

public class Bankaccount {

    //Attributes -> tulajdonsagok
    private double balance; //egysegbezaras -> encapsulation
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

    //Getters
    public double getBalance(){
        return this.balance;
    }

    //Setters

    public void setAccountNumber(String accountNumber){
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
