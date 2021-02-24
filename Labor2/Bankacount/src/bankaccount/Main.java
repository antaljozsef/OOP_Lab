package bankaccount;

public class Main {

    public static void main(String[] args) {
        //itt hozunk majd letre peldanyokat (objektum, instance)
        Bankaccount myAccount = new Bankaccount(999999, "AGSHIASDHIA");
        Bankaccount myAccount1 = new Bankaccount(999999);
        Bankaccount myAccount2 = new Bankaccount();

        System.out.println(myAccount.toString());
        System.out.println(myAccount1);
        System.out.println(myAccount2.toString());

        System.out.println(myAccount.getBalance());
        myAccount.setAccountNumber("12345");

        System.out.println(myAccount);

        //myAccount.balance = -100; //nem eri el a privat adattagot, egysegbezaras miatt

    }
}
