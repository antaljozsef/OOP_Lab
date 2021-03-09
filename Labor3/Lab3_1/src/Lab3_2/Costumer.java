package Lab3_2;

import Lab3_1.Bankaccount;

public class Costumer {
    private String firstName;
    private String lastName;
    private Bankaccount account;
    private Bankaccount[] accounts;
    private int numAccounts;

    public Costumer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        account = new Bankaccount();
    }

    public void addAccount(Bankaccount account){
        this.accounts[this.numAccounts] = account;
        numAccounts++;
    }

    public void closeAccounts(Bankaccount accounts){
        this.accounts[numAccounts] = null;
    }

    public int getNumAccounts(int numAccounts){
        this.numAccounts = numAccounts;
    }

    public void setAccount(Bankaccount account){
        this.account = account;
    }

    public Bankaccount getAccount(){
        return account;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void closeAccount(){
        this.account = null;
    }

    public void close

    @Override

    public String toString(){
        if(this.account!=null){
            return firstName + " " + lastName + " "  + "customer" + " "  + "Account" + " "  +
                    account.getAccountNumber() + " " + account.getBalance();
        }
        else{
            return "No account";
        }
    }
}
