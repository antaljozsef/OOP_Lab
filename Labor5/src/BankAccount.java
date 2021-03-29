public class BankAccount {
    private double balance;
    private final String accountNumber;
    public static final  String PREFIX = "OTP";
    private static int numAccounts = 0;
    public static final int ACCOUNT_NUMBER_LENGHT = 10;

    BankAccount(String accountNumber) {
        ++numAccounts;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public String createAccountNumber(){
        int prefixLength = PREFIX.length();
        int numAccuntLENGHT = String.valueOf(numAccounts).length();
        int zerosCount = ACCOUNT_NUMBER_LENGHT - prefixLength - numAccuntLENGHT;

        String result = PREFIX;
        for (int i=0; i<zerosCount; i++){
            result += "0";
        }
        result += numAccounts;
        return result;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    void deposit(double amount) {
        if(amount < 0)
            return;

        this.balance += amount;
    }

    boolean withdraw(double amount) {
        if(this.balance - amount < 0) {
            System.out.println("You do not have sufficient funds for this operation!");
            return false;
        }

        this.balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return this.accountNumber + ": E " + this.balance;
    }
}
