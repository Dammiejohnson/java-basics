package oop;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.withdrawal(100.0);

        bankAccount.deposit(50.0);
        bankAccount.withdrawal(100.0);

        bankAccount.deposit(51.0);
        bankAccount.withdrawal(100.0);
    }
}
