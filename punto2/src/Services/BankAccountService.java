package Services;

import Model.BankAccount;

import java.util.Scanner;

public class BankAccountService {
    Scanner scanner = new Scanner(System.in);

    public double credit(BankAccount account) {
        double balance = account.getMoney();
        System.out.println("Enter the amount of money $$");
        double amount = Double.parseDouble(scanner.nextLine());

        balance += amount;

        account.setMoney(balance);

        return balance;
    }

    public double debit(BankAccount account) {
        double balance = account.getMoney();

        if (balance <= 0) {
            System.out.println("You can't extract money, the account balance is 0 or negative.");
            return balance;
        }

        System.out.println("Enter the amount you will extract: ");
        double amount = Double.parseDouble(scanner.nextLine());

        if (amount <= 0) {
            System.out.println("The amount to extract must be greater than 0.");
        } else if (balance - amount < 0) {
            System.out.println("You can't extract more money than what is available.");
        } else {
            balance -= amount;
            account.setMoney(balance);
            System.out.println("Extraction successful. New balance: " + balance);
        }

        return balance;
    }

    public void printToScreen (BankAccount account){
        System.out.println(account.getName());
        System.out.println(account.getLastName());
        System.out.println(account.getDni());
        System.out.println(account.getMoney());
    }
}

