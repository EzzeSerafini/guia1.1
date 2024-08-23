package Services;

import Models.ItemsModels;

import java.util.Scanner;

public class ItemsServices {
    Scanner scanner = new Scanner(System.in);

    ///Hacer ABM aca

    public int stockItem(ItemsModels item) {
        int stock = item.getCant();

        System.out.println("Introduce the amount for the stock ");
        int cant = Integer.parseInt(scanner.nextLine());

        stock += cant;

        item.setCant(stock);

        return stock;
    }

    public int sellItem(ItemsModels item) {
        int cantItem = item.getCant();

        if (cantItem == 0) {
            System.out.println("There's no more stock available.");
            return cantItem;
        }

        System.out.println("How many units do you want to sell?");
        int sell = Integer.parseInt(scanner.nextLine());

        if (cantItem - sell < 0) {
            System.out.println("You selected too many units.");
            return cantItem;
        } else if (cantItem - sell == 0) {
            System.out.println("You sold the last unit.");
        } else {
            cantItem -= sell;
            item.setCant(cantItem);
        }

        return cantItem;
    }
}

