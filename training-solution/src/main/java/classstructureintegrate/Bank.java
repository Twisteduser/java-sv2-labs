package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String owner = scanner.nextLine();

        System.out.println("Please enter your account number:");
        String accountNumber = scanner.nextLine();

        System.out.println("Please enter the amount of the base money:");
        int balance = scanner.nextInt();
        scanner.nextLine();

        BankAccount bankAccount = new BankAccount(owner, accountNumber, balance);
        System.out.println(bankAccount.getInfo());

        System.out.println("Enter the deposit amount:");
        int amountDeposit =scanner.nextInt();
        bankAccount.deposit(amountDeposit);
        System.out.println(bankAccount.getInfo());

        System.out.println("Enter the withdraw amount:");
        int amountWithdraw =scanner.nextInt();
        bankAccount.withdraw(amountWithdraw);
        System.out.println(bankAccount.getInfo());
    }
}
