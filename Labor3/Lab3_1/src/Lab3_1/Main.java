package Lab3_1;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        //itt hozunk majd letre peldanyokat (objektum, instance)
        Bankaccount myAccount = new Bankaccount(999999, "AGSHIASDHIA");
        /**
         Bankaccount myAccount1 = new Bankaccount(999999);
         Bankaccount myAccount2 = new Bankaccount();
         */

        System.out.println(myAccount.toString());
        /**
         System.out.println(myAccount1);
         System.out.println(myAccount2.toString());
         System.out.println(myAccount.getBalance());
         */

        myAccount.setAccountNumber("12345");

        System.out.println("Balance before transaction: " + myAccount);
        myAccount.takeOut(111111);
        System.out.println("Balance after transaction: " + myAccount);

        System.out.println("Balance before transaction: " + myAccount);
        myAccount.putIn(222222);
        System.out.println("Balance after transaction: " + myAccount);

        //myAccount.balance = -100; //nem eri el a privat adattagot, egysegbezaras miatt

        System.out.println("\n\n");

        Costumer costumer1 = new Costumer("Jhon","Black");
        System.out.println(costumer1.toString());
        costumer1.setAccount(myAccount);
        System.out.println(costumer1.toString());

        Costumer costumer2 = new Costumer("Mary","White");
        System.out.println(costumer1.toString());
        costumer1.setAccount(myAccount);
        System.out.println(costumer1.toString());

        costumer1.getAccount().deposit(1000);

        costumer2.setLastName("Black");
        costumer2.closeAccount();


    }
}
