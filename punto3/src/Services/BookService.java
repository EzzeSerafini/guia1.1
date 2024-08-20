package Services;

import Models.BookModel;

import java.util.Scanner;

public class BookService {
    Scanner scanner = new Scanner(System.in);
//    Un método que permita vender una cierta cantidad de copias de un
//    libro, disminuyendo la cantidad disponible. Si no hay suficientes
//    copias, debe mostrar un mensaje indicando que la operación no es
//    posible.
//    Un método que permita incrementar la cantidad de copias disponibles
//    en el inventario.

    public int sellBook(BookModel book) {
        int cantBook = book.getCant();

        if (cantBook == 0) {
            System.out.println("Theres no more copies of this book");
            return cantBook;
        }

        System.out.println("How many copies do you want ");
        int sell = Integer.parseInt(scanner.nextLine());

        if (cantBook - sell < 0) {
            System.out.println("You select too many copies ");
            return cantBook;
        } else if (cantBook - sell == 0) {
            System.out.println("You sell the last copy of the book");
            return cantBook;
        } else {
            cantBook -= sell;
            book.setCant(cantBook);

        }

        return cantBook;
    }

    public int moreStock(BookModel book) {
        int stock = book.getCant();
        System.out.println("How many new copies enter? ");
        int copy = Integer.parseInt(scanner.nextLine());

        stock += copy;

        book.setCant(stock);

        return stock;
    }

    public void printBookDetails(BookModel book) {
        System.out.println("Libro[id=" + book.getId() +
                ", título=" + book.getTitle() +
                ", autor=" + book.getAuthor() +
                ", precio=" + book.getPrices() +
                ", copias disponibles=" + book.getCant() + "]");
    }

}
