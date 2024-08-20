import Model.BankAccount;
import Services.BankAccountService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name ");
        String name = scanner.nextLine();

        System.out.println("Enter the last name ");
        String lastname = scanner.nextLine();

        System.out.println("Enter dni ");
        String dni= scanner.nextLine();

        System.out.println("Enter the initial deposit amount: ");
        double initialDeposit = Double.parseDouble(scanner.nextLine());

        BankAccount account = new BankAccount(name, dni, lastname, initialDeposit);

        while (true) {
            System.out.println("Do you want to make a deposit (D) or withdraw (W) or exit (E)? ");
            String action = scanner.nextLine().toUpperCase();

            BankAccountService bankAccountService = new BankAccountService();

            if (action.equals("D")) {
                bankAccountService.credit(account);
            } else if (action.equals("W")) {
                bankAccountService.debit(account);
            } else if (action.equals("E")) {
                break;
            } else {
                System.out.println("Invalid option. Please enter D, W, or E.");
            }

            bankAccountService.printToScreen(account);
        }

        System.out.println("Thank you for using the bank service.");
    }
}