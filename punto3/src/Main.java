import Models.BookModel;
import Services.BookService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BookService bookService = new BookService();

        // Inicializando los libros
        BookModel book1 = new BookModel("El Quijote", "Miguel de Cervantes", 500.0, 10, 0);
        BookModel book2 = new BookModel("Cien Años de Soledad", "Gabriel García Márquez", 700.0, 5, 0);

        while (true) {
            System.out.println("Choose an action: ");
            System.out.println("1 - Sell book copies");
            System.out.println("2 - Add stock");
            System.out.println("3 - Print book details");
            System.out.println("4 - Exit");

            int action = Integer.parseInt(scanner.nextLine());

            if (action == 1) {
                // Vender copias de un libro
                System.out.println("Which book do you want to sell copies of? (1 or 2)");
                int bookChoice = Integer.parseInt(scanner.nextLine());

                if (bookChoice == 1) {
                    bookService.sellBook(book1);
                } else if (bookChoice == 2) {
                    bookService.sellBook(book2);
                } else {
                    System.out.println("Invalid book choice.");
                }
            } else if (action == 2) {
                // Agregar stock de un libro
                System.out.println("Which book do you want to add stock to? (1 or 2)");
                int bookChoice = Integer.parseInt(scanner.nextLine());

                if (bookChoice == 1) {
                    bookService.moreStock(book1);
                } else if (bookChoice == 2) {
                    bookService.moreStock(book2);
                } else {
                    System.out.println("Invalid book choice.");
                }
            } else if (action == 3) {
                // Imprimir detalles de los libros
                System.out.println("Which book details do you want to print? (1 or 2)");
                int bookChoice = Integer.parseInt(scanner.nextLine());

                if (bookChoice == 1) {
                    bookService.printBookDetails(book1);
                } else if (bookChoice == 2) {
                    bookService.printBookDetails(book2);
                } else {
                    System.out.println("Invalid book choice.");
                }
            } else if (action == 4) {
                // Salir del bucle
                break;
            } else {
                System.out.println("Invalid action. Please choose a valid option.");
            }
        }

        System.out.println("Thank you for using the book management system.");
    }
}
