import Models.ItemsModels;
import Services.ItemsServices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ItemsServices itemsServices = new ItemsServices();
        ItemsModels item = null;

        int option;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Print item");
            System.out.println("3. Update stock");
            System.out.println("4. Update unit price");
            System.out.println("5. Print total price");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    System.out.print("Introduce the ID of the item: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter the description of the item: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter the quantity: ");
                    int cant = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter the unit price: ");
                    double price = Double.parseDouble(scanner.nextLine());

                    item = new ItemsModels(id, description, cant, price);
                    System.out.println("Successfully  saved.");
                    break;

                case 2:
                    if (item != null) {
                        System.out.println(item);
                    } else {
                        System.out.println("Theres no more stock.");
                    }
                    break;

                case 3:

                    if (item != null) {
                        System.out.print("Enter the new amount: ");
                        int newCant = Integer.parseInt(scanner.nextLine());
                        item.setCant(newCant);
                        System.out.println("Successfully updated the amount.");
                    } else {
                        System.out.println("Theres no item to update");
                    }
                    break;

                case 4:

                    if (item != null) {
                        System.out.print("Enter the unit price ");
                        double newPrice = Double.parseDouble(scanner.nextLine());
                        item.setPrice(newPrice);
                        System.out.println("Successfully updated.");
                    } else {
                        System.out.println("Theres no item to update");
                    }
                    break;

                case 5:
                    if (item != null) {
                        double total = item.calcularPrecioTotal();
                        System.out.println("The total is : " + total);
                    } else {
                        System.out.println("No stock.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }

            System.out.println();

        } while (option != 6);

        scanner.close();
    }
}
