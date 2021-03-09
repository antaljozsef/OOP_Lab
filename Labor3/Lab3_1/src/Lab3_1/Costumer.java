package Lab3_1;

public class Costumer {
    private String firstName;
    private String lastName;
    private Bankaccount account;

    public Costumer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        account = new Bankaccount();
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
